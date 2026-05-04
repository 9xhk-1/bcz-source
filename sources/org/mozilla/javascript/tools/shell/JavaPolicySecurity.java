package org.mozilla.javascript.tools.shell;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.AccessControlContext;
import java.security.AccessControlException;
import java.security.AccessController;
import java.security.CodeSource;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Policy;
import java.security.PrivilegedAction;
import java.security.ProtectionDomain;
import java.security.cert.Certificate;
import java.util.Enumeration;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.GeneratedClassLoader;
import org.mozilla.javascript.Scriptable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class JavaPolicySecurity extends SecurityProxy {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ContextPermissions extends PermissionCollection {
        static final long serialVersionUID = -1721494496320750721L;
        AccessControlContext _context = AccessController.getContext();
        PermissionCollection _statisPermissions;

        public ContextPermissions(ProtectionDomain protectionDomain) {
            if (protectionDomain != null) {
                this._statisPermissions = protectionDomain.getPermissions();
            }
            setReadOnly();
        }

        @Override // java.security.PermissionCollection
        public void add(Permission permission) {
            throw new RuntimeException("NOT IMPLEMENTED");
        }

        @Override // java.security.PermissionCollection
        public Enumeration<Permission> elements() {
            return new Enumeration<Permission>() { // from class: org.mozilla.javascript.tools.shell.JavaPolicySecurity.ContextPermissions.1
                @Override // java.util.Enumeration
                public boolean hasMoreElements() {
                    return false;
                }

                @Override // java.util.Enumeration
                public Permission nextElement() {
                    return null;
                }
            };
        }

        @Override // java.security.PermissionCollection
        public boolean implies(Permission permission) {
            PermissionCollection permissionCollection = this._statisPermissions;
            if (permissionCollection != null && !permissionCollection.implies(permission)) {
                return false;
            }
            try {
                this._context.checkPermission(permission);
                return true;
            } catch (AccessControlException unused) {
                return false;
            }
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(getClass().getName());
            stringBuffer.append('@');
            stringBuffer.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuffer.append(" (context=");
            stringBuffer.append(this._context);
            stringBuffer.append(", static_permitions=");
            stringBuffer.append(this._statisPermissions);
            stringBuffer.append(')');
            return stringBuffer.toString();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Loader extends ClassLoader implements GeneratedClassLoader {
        private ProtectionDomain domain;

        public Loader(ClassLoader classLoader, ProtectionDomain protectionDomain) {
            super(classLoader == null ? ClassLoader.getSystemClassLoader() : classLoader);
            this.domain = protectionDomain;
        }

        @Override // org.mozilla.javascript.GeneratedClassLoader
        public Class<?> defineClass(String str, byte[] bArr) {
            return super.defineClass(str, bArr, 0, bArr.length, this.domain);
        }

        @Override // org.mozilla.javascript.GeneratedClassLoader
        public void linkClass(Class<?> cls) {
            resolveClass(cls);
        }
    }

    public JavaPolicySecurity() {
        new CodeSource((URL) null, (Certificate[]) null);
    }

    private ProtectionDomain getDynamicDomain(ProtectionDomain protectionDomain) {
        return new ProtectionDomain(null, new ContextPermissions(protectionDomain));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ProtectionDomain getUrlDomain(URL url) {
        CodeSource codeSource = new CodeSource(url, (Certificate[]) null);
        return new ProtectionDomain(codeSource, Policy.getPolicy().getPermissions(codeSource));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public URL getUrlObj(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException unused) {
            String replace = System.getProperty("user.dir").replace('\\', '/');
            if (!replace.endsWith("/")) {
                replace = replace + '/';
            }
            try {
                return new URL(new URL("file:" + replace), str);
            } catch (MalformedURLException e11) {
                throw new RuntimeException("Can not construct file URL for '" + str + "':" + e11.getMessage());
            }
        }
    }

    @Override // org.mozilla.javascript.tools.shell.SecurityProxy
    public void callProcessFileSecure(final Context context, final Scriptable scriptable, final String str) {
        AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: org.mozilla.javascript.tools.shell.JavaPolicySecurity.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                URL urlObj = JavaPolicySecurity.this.getUrlObj(str);
                try {
                    Main.processFileSecure(context, scriptable, urlObj.toExternalForm(), JavaPolicySecurity.this.getUrlDomain(urlObj));
                    return null;
                } catch (IOException e11) {
                    throw new RuntimeException(e11);
                }
            }
        });
    }

    @Override // org.mozilla.javascript.SecurityController
    public Object callWithDomain(Object obj, final Context context, final Callable callable, final Scriptable scriptable, final Scriptable scriptable2, final Object[] objArr) {
        return AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: org.mozilla.javascript.tools.shell.JavaPolicySecurity.3
            @Override // java.security.PrivilegedAction
            public Object run() {
                return callable.call(context, scriptable, scriptable2, objArr);
            }
        }, new AccessControlContext(new ProtectionDomain[]{getDynamicDomain((ProtectionDomain) obj)}));
    }

    @Override // org.mozilla.javascript.SecurityController
    public GeneratedClassLoader createClassLoader(final ClassLoader classLoader, Object obj) {
        final ProtectionDomain protectionDomain = (ProtectionDomain) obj;
        return (GeneratedClassLoader) AccessController.doPrivileged(new PrivilegedAction<Loader>() { // from class: org.mozilla.javascript.tools.shell.JavaPolicySecurity.2
            @Override // java.security.PrivilegedAction
            public Loader run() {
                return new Loader(classLoader, protectionDomain);
            }
        });
    }

    @Override // org.mozilla.javascript.SecurityController
    public Object getDynamicSecurityDomain(Object obj) {
        return getDynamicDomain((ProtectionDomain) obj);
    }

    @Override // org.mozilla.javascript.SecurityController
    public Class<?> getStaticSecurityDomainClassInternal() {
        return ProtectionDomain.class;
    }
}
