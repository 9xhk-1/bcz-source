package org.mozilla.javascript.commonjs.module.provider;

import fx.d;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class UrlModuleSourceProvider extends ModuleSourceProviderBase {
    private static final long serialVersionUID = 1;
    private final Iterable<URI> fallbackUris;
    private final Iterable<URI> privilegedUris;
    private final UrlConnectionExpiryCalculator urlConnectionExpiryCalculator;
    private final UrlConnectionSecurityDomainProvider urlConnectionSecurityDomainProvider;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class URLValidator implements Serializable {
        private static final long serialVersionUID = 1;
        private final String entityTags;
        private long expiry;
        private final long lastModified;
        private final URI uri;

        public URLValidator(URI uri, URLConnection uRLConnection, long j11, UrlConnectionExpiryCalculator urlConnectionExpiryCalculator) {
            this.uri = uri;
            this.lastModified = uRLConnection.getLastModified();
            this.entityTags = getEntityTags(uRLConnection);
            this.expiry = calculateExpiry(uRLConnection, j11, urlConnectionExpiryCalculator);
        }

        private long calculateExpiry(URLConnection uRLConnection, long j11, UrlConnectionExpiryCalculator urlConnectionExpiryCalculator) {
            if (d.f52399f.equals(uRLConnection.getHeaderField("Pragma"))) {
                return 0L;
            }
            String headerField = uRLConnection.getHeaderField("Cache-Control");
            if (headerField != null) {
                if (headerField.indexOf(d.f52399f) != -1) {
                    return 0L;
                }
                int maxAge = getMaxAge(headerField);
                if (-1 != maxAge) {
                    long currentTimeMillis = System.currentTimeMillis();
                    return (maxAge * 1000) + (currentTimeMillis - (Math.max(Math.max(0L, currentTimeMillis - uRLConnection.getDate()), uRLConnection.getHeaderFieldInt("Age", 0) * 1000) + (currentTimeMillis - j11)));
                }
            }
            long headerFieldDate = uRLConnection.getHeaderFieldDate("Expires", -1L);
            if (headerFieldDate != -1) {
                return headerFieldDate;
            }
            if (urlConnectionExpiryCalculator == null) {
                return 0L;
            }
            return urlConnectionExpiryCalculator.calculateExpiry(uRLConnection);
        }

        private String getEntityTags(URLConnection uRLConnection) {
            List<String> list = uRLConnection.getHeaderFields().get("ETag");
            if (list == null || list.isEmpty()) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            Iterator<String> it = list.iterator();
            sb2.append(it.next());
            while (it.hasNext()) {
                sb2.append(j2.O);
                sb2.append(it.next());
            }
            return sb2.toString();
        }

        private int getMaxAge(String str) {
            int indexOf;
            int indexOf2 = str.indexOf(d.f52395b);
            if (indexOf2 == -1 || (indexOf = str.indexOf(61, indexOf2 + 7)) == -1) {
                return -1;
            }
            int i11 = indexOf + 1;
            int indexOf3 = str.indexOf(44, i11);
            try {
                return Integer.parseInt(indexOf3 == -1 ? str.substring(i11) : str.substring(i11, indexOf3));
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        private boolean isResourceChanged(URLConnection uRLConnection) throws IOException {
            return uRLConnection instanceof HttpURLConnection ? ((HttpURLConnection) uRLConnection).getResponseCode() == 304 : this.lastModified == uRLConnection.getLastModified();
        }

        public boolean appliesTo(URI uri) {
            return this.uri.equals(uri);
        }

        public void applyConditionals(URLConnection uRLConnection) {
            long j11 = this.lastModified;
            if (j11 != 0) {
                uRLConnection.setIfModifiedSince(j11);
            }
            String str = this.entityTags;
            if (str == null || str.length() <= 0) {
                return;
            }
            uRLConnection.addRequestProperty("If-None-Match", this.entityTags);
        }

        public boolean entityNeedsRevalidation() {
            return System.currentTimeMillis() > this.expiry;
        }

        public boolean updateValidator(URLConnection uRLConnection, long j11, UrlConnectionExpiryCalculator urlConnectionExpiryCalculator) throws IOException {
            boolean isResourceChanged = isResourceChanged(uRLConnection);
            if (!isResourceChanged) {
                this.expiry = calculateExpiry(uRLConnection, j11, urlConnectionExpiryCalculator);
            }
            return isResourceChanged;
        }
    }

    public UrlModuleSourceProvider(Iterable<URI> iterable, Iterable<URI> iterable2) {
        this(iterable, iterable2, new DefaultUrlConnectionExpiryCalculator(), null);
    }

    private void close(URLConnection uRLConnection) {
        try {
            uRLConnection.getInputStream().close();
        } catch (IOException e11) {
            onFailedClosingUrlConnection(uRLConnection, e11);
        }
    }

    private static String getCharacterEncoding(URLConnection uRLConnection) {
        ParsedContentType parsedContentType = new ParsedContentType(uRLConnection.getContentType());
        String encoding = parsedContentType.getEncoding();
        if (encoding != null) {
            return encoding;
        }
        String contentType = parsedContentType.getContentType();
        return (contentType == null || !contentType.startsWith("text/")) ? "utf-8" : "8859_1";
    }

    private static Reader getReader(URLConnection uRLConnection) throws IOException {
        return new InputStreamReader(uRLConnection.getInputStream(), getCharacterEncoding(uRLConnection));
    }

    private Object getSecurityDomain(URLConnection uRLConnection) {
        UrlConnectionSecurityDomainProvider urlConnectionSecurityDomainProvider = this.urlConnectionSecurityDomainProvider;
        if (urlConnectionSecurityDomainProvider == null) {
            return null;
        }
        return urlConnectionSecurityDomainProvider.getSecurityDomain(uRLConnection);
    }

    private ModuleSource loadFromPathList(String str, Object obj, Iterable<URI> iterable) throws IOException, URISyntaxException {
        if (iterable == null) {
            return null;
        }
        for (URI uri : iterable) {
            ModuleSource loadFromUri = loadFromUri(uri.resolve(str), uri, obj);
            if (loadFromUri != null) {
                return loadFromUri;
            }
        }
        return null;
    }

    @Override // org.mozilla.javascript.commonjs.module.provider.ModuleSourceProviderBase
    public boolean entityNeedsRevalidation(Object obj) {
        return !(obj instanceof URLValidator) || ((URLValidator) obj).entityNeedsRevalidation();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
    
        if (r0.appliesTo(r14) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.mozilla.javascript.commonjs.module.provider.ModuleSource loadFromActualUri(java.net.URI r18, java.net.URI r19, java.lang.Object r20) throws java.io.IOException {
        /*
            r17 = this;
            r1 = r17
            r0 = r20
            java.net.URL r2 = new java.net.URL
            r3 = 0
            if (r19 != 0) goto Lb
            r4 = r3
            goto Lf
        Lb:
            java.net.URL r4 = r19.toURL()
        Lf:
            java.lang.String r5 = r18.toString()
            r2.<init>(r4, r5)
            long r9 = java.lang.System.currentTimeMillis()
            java.net.URLConnection r8 = r1.openUrlConnection(r2)
            boolean r2 = r0 instanceof org.mozilla.javascript.commonjs.module.provider.UrlModuleSourceProvider.URLValidator
            if (r2 == 0) goto L2d
            org.mozilla.javascript.commonjs.module.provider.UrlModuleSourceProvider$URLValidator r0 = (org.mozilla.javascript.commonjs.module.provider.UrlModuleSourceProvider.URLValidator) r0
            r14 = r18
            boolean r2 = r0.appliesTo(r14)
            if (r2 == 0) goto L2f
            goto L30
        L2d:
            r14 = r18
        L2f:
            r0 = r3
        L30:
            if (r0 == 0) goto L35
            r0.applyConditionals(r8)
        L35:
            r8.connect()     // Catch: java.io.IOException -> L48 java.lang.RuntimeException -> L4a java.io.FileNotFoundException -> L73
            if (r0 == 0) goto L4c
            org.mozilla.javascript.commonjs.module.provider.UrlConnectionExpiryCalculator r2 = r1.urlConnectionExpiryCalculator     // Catch: java.io.IOException -> L48 java.lang.RuntimeException -> L4a java.io.FileNotFoundException -> L73
            boolean r0 = r0.updateValidator(r8, r9, r2)     // Catch: java.io.IOException -> L48 java.lang.RuntimeException -> L4a java.io.FileNotFoundException -> L73
            if (r0 == 0) goto L4c
            r1.close(r8)     // Catch: java.io.IOException -> L48 java.lang.RuntimeException -> L4a java.io.FileNotFoundException -> L73
            org.mozilla.javascript.commonjs.module.provider.ModuleSource r0 = org.mozilla.javascript.commonjs.module.provider.ModuleSourceProvider.NOT_MODIFIED     // Catch: java.io.IOException -> L48 java.lang.RuntimeException -> L4a java.io.FileNotFoundException -> L73
            return r0
        L48:
            r0 = move-exception
            goto L6b
        L4a:
            r0 = move-exception
            goto L6f
        L4c:
            org.mozilla.javascript.commonjs.module.provider.ModuleSource r0 = new org.mozilla.javascript.commonjs.module.provider.ModuleSource     // Catch: java.io.IOException -> L48 java.lang.RuntimeException -> L4a java.io.FileNotFoundException -> L73
            java.io.Reader r12 = getReader(r8)     // Catch: java.io.IOException -> L48 java.lang.RuntimeException -> L4a java.io.FileNotFoundException -> L73
            java.lang.Object r13 = r1.getSecurityDomain(r8)     // Catch: java.io.IOException -> L48 java.lang.RuntimeException -> L4a java.io.FileNotFoundException -> L73
            org.mozilla.javascript.commonjs.module.provider.UrlModuleSourceProvider$URLValidator r16 = new org.mozilla.javascript.commonjs.module.provider.UrlModuleSourceProvider$URLValidator     // Catch: java.io.IOException -> L48 java.lang.RuntimeException -> L4a java.io.FileNotFoundException -> L73
            org.mozilla.javascript.commonjs.module.provider.UrlConnectionExpiryCalculator r11 = r1.urlConnectionExpiryCalculator     // Catch: java.io.IOException -> L48 java.lang.RuntimeException -> L4a java.io.FileNotFoundException -> L73
            r7 = r14
            r6 = r16
            r6.<init>(r7, r8, r9, r11)     // Catch: java.io.IOException -> L48 java.lang.RuntimeException -> L4a java.io.FileNotFoundException -> L73
            r14 = r18
            r15 = r19
            r11 = r0
            r16 = r6
            r11.<init>(r12, r13, r14, r15, r16)     // Catch: java.io.IOException -> L48 java.lang.RuntimeException -> L4a java.io.FileNotFoundException -> L73
            return r11
        L6b:
            r1.close(r8)
            throw r0
        L6f:
            r1.close(r8)
            throw r0
        L73:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.commonjs.module.provider.UrlModuleSourceProvider.loadFromActualUri(java.net.URI, java.net.URI, java.lang.Object):org.mozilla.javascript.commonjs.module.provider.ModuleSource");
    }

    @Override // org.mozilla.javascript.commonjs.module.provider.ModuleSourceProviderBase
    public ModuleSource loadFromFallbackLocations(String str, Object obj) throws IOException, URISyntaxException {
        return loadFromPathList(str, obj, this.fallbackUris);
    }

    @Override // org.mozilla.javascript.commonjs.module.provider.ModuleSourceProviderBase
    public ModuleSource loadFromPrivilegedLocations(String str, Object obj) throws IOException, URISyntaxException {
        return loadFromPathList(str, obj, this.privilegedUris);
    }

    @Override // org.mozilla.javascript.commonjs.module.provider.ModuleSourceProviderBase
    public ModuleSource loadFromUri(URI uri, URI uri2, Object obj) throws IOException, URISyntaxException {
        ModuleSource loadFromActualUri = loadFromActualUri(new URI(uri + ".js"), uri2, obj);
        return loadFromActualUri != null ? loadFromActualUri : loadFromActualUri(uri, uri2, obj);
    }

    public URLConnection openUrlConnection(URL url) throws IOException {
        return url.openConnection();
    }

    public UrlModuleSourceProvider(Iterable<URI> iterable, Iterable<URI> iterable2, UrlConnectionExpiryCalculator urlConnectionExpiryCalculator, UrlConnectionSecurityDomainProvider urlConnectionSecurityDomainProvider) {
        this.privilegedUris = iterable;
        this.fallbackUris = iterable2;
        this.urlConnectionExpiryCalculator = urlConnectionExpiryCalculator;
        this.urlConnectionSecurityDomainProvider = urlConnectionSecurityDomainProvider;
    }

    public void onFailedClosingUrlConnection(URLConnection uRLConnection, IOException iOException) {
    }
}
