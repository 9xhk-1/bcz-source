package org.mozilla.javascript.commonjs.module.provider;

import androidx.collection.SieveCacheKt;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class ModuleSourceProviderBase implements ModuleSourceProvider, Serializable {
    private static final long serialVersionUID = 1;

    private static String ensureTrailingSlash(String str) {
        return str.endsWith("/") ? str : str.concat("/");
    }

    private ModuleSource loadFromPathArray(String str, Scriptable scriptable, Object obj) throws IOException {
        long uint32 = ScriptRuntime.toUint32(ScriptableObject.getProperty(scriptable, "length"));
        int i11 = uint32 > SieveCacheKt.NodeLinkMask ? Integer.MAX_VALUE : (int) uint32;
        for (int i12 = 0; i12 < i11; i12++) {
            String ensureTrailingSlash = ensureTrailingSlash((String) ScriptableObject.getTypedProperty(scriptable, i12, String.class));
            try {
                URI uri = new URI(ensureTrailingSlash);
                if (!uri.isAbsolute()) {
                    uri = new File(ensureTrailingSlash).toURI().resolve("");
                }
                ModuleSource loadFromUri = loadFromUri(uri.resolve(str), uri, obj);
                if (loadFromUri != null) {
                    return loadFromUri;
                }
            } catch (URISyntaxException e11) {
                throw new MalformedURLException(e11.getMessage());
            }
        }
        return null;
    }

    public boolean entityNeedsRevalidation(Object obj) {
        return true;
    }

    public ModuleSource loadFromFallbackLocations(String str, Object obj) throws IOException, URISyntaxException {
        return null;
    }

    public ModuleSource loadFromPrivilegedLocations(String str, Object obj) throws IOException, URISyntaxException {
        return null;
    }

    public abstract ModuleSource loadFromUri(URI uri, URI uri2, Object obj) throws IOException, URISyntaxException;

    @Override // org.mozilla.javascript.commonjs.module.provider.ModuleSourceProvider
    public ModuleSource loadSource(String str, Scriptable scriptable, Object obj) throws IOException, URISyntaxException {
        ModuleSource loadFromPathArray;
        if (!entityNeedsRevalidation(obj)) {
            return ModuleSourceProvider.NOT_MODIFIED;
        }
        ModuleSource loadFromPrivilegedLocations = loadFromPrivilegedLocations(str, obj);
        return loadFromPrivilegedLocations != null ? loadFromPrivilegedLocations : (scriptable == null || (loadFromPathArray = loadFromPathArray(str, scriptable, obj)) == null) ? loadFromFallbackLocations(str, obj) : loadFromPathArray;
    }

    @Override // org.mozilla.javascript.commonjs.module.provider.ModuleSourceProvider
    public ModuleSource loadSource(URI uri, URI uri2, Object obj) throws IOException, URISyntaxException {
        return loadFromUri(uri, uri2, obj);
    }
}
