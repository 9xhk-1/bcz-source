package po;

import com.google.common.base.StandardSystemProperty;
import com.google.common.collect.ImmutableList;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryFlag;
import java.nio.file.attribute.AclEntryPermission;
import java.nio.file.attribute.AclEntryType;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermissions;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;
import po.h0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@q
/* loaded from: classes7.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f81052a = c();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends h0 {

        /* renamed from: b, reason: collision with root package name */
        public static final int f81053b = 10000;

        public b() {
            super();
        }

        @Override // po.h0
        public File a() {
            File file = new File(StandardSystemProperty.JAVA_IO_TMPDIR.value());
            String str = System.currentTimeMillis() + Constants.ACCEPT_TIME_SEPARATOR_SERVER;
            for (int i11 = 0; i11 < 10000; i11++) {
                File file2 = new File(file, str + i11);
                if (file2.mkdir()) {
                    return file2;
                }
            }
            throw new IllegalStateException("Failed to create directory within 10000 attempts (tried " + str + "0 to " + str + "9999)");
        }

        @Override // po.h0
        public File b(String prefix) throws IOException {
            return File.createTempFile(prefix, null, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends h0 {

        /* renamed from: b, reason: collision with root package name */
        public static final String f81057b = "Guava cannot securely create temporary files or directories under SDK versions before Jelly Bean. You can create one yourself, either in the insecure default directory or in a more secure directory, such as context.getCacheDir(). For more information, see the Javadoc for Files.createTempDir().";

        public d() {
            super();
        }

        @Override // po.h0
        public File a() {
            throw new IllegalStateException(f81057b);
        }

        @Override // po.h0
        public File b(String prefix) throws IOException {
            throw new IOException(f81057b);
        }
    }

    public static h0 c() {
        try {
            try {
                Class.forName("java.nio.file.Path");
                return new c();
            } catch (ClassNotFoundException unused) {
                return ((Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null)).intValue() < ((Integer) Class.forName("android.os.Build$VERSION_CODES").getField("JELLY_BEAN").get(null)).intValue() ? new d() : new b();
            }
        } catch (ClassNotFoundException unused2) {
            return new d();
        } catch (IllegalAccessException unused3) {
            return new d();
        } catch (NoSuchFieldException unused4) {
            return new d();
        }
    }

    @go.e
    @u
    public static void d() throws IOException {
        c.l().get();
    }

    public abstract File a();

    public abstract File b(String prefix) throws IOException;

    public h0() {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u
    public static final class c extends h0 {

        /* renamed from: b, reason: collision with root package name */
        public static final b f81054b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f81055c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements FileAttribute<ImmutableList<AclEntry>> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ImmutableList f81056a;

            public a(final ImmutableList val$acl) {
                this.f81056a = val$acl;
            }

            @Override // java.nio.file.attribute.FileAttribute
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ImmutableList<AclEntry> value() {
                return this.f81056a;
            }

            @Override // java.nio.file.attribute.FileAttribute
            public String name() {
                return "acl:acl";
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u
        public interface b {
            FileAttribute<?> get() throws IOException;
        }

        static {
            FileSystem fileSystem;
            Set supportedFileAttributeViews;
            fileSystem = FileSystems.getDefault();
            supportedFileAttributeViews = fileSystem.supportedFileAttributeViews();
            if (supportedFileAttributeViews.contains("posix")) {
                f81054b = new b() { // from class: po.c1
                    @Override // po.h0.c.b
                    public final FileAttribute get() {
                        return h0.c.f();
                    }
                };
                f81055c = new b() { // from class: po.d1
                    @Override // po.h0.c.b
                    public final FileAttribute get() {
                        return h0.c.e();
                    }
                };
            } else if (supportedFileAttributeViews.contains("acl")) {
                b l11 = l();
                f81055c = l11;
                f81054b = l11;
            } else {
                b bVar = new b() { // from class: po.e1
                    @Override // po.h0.c.b
                    public final FileAttribute get() {
                        return h0.c.h();
                    }
                };
                f81055c = bVar;
                f81054b = bVar;
            }
        }

        public c() {
            super();
        }

        public static /* synthetic */ FileAttribute e() {
            Set fromString;
            FileAttribute asFileAttribute;
            fromString = PosixFilePermissions.fromString("rwx------");
            asFileAttribute = PosixFilePermissions.asFileAttribute(fromString);
            return asFileAttribute;
        }

        public static /* synthetic */ FileAttribute f() {
            Set fromString;
            FileAttribute asFileAttribute;
            fromString = PosixFilePermissions.fromString("rw-------");
            asFileAttribute = PosixFilePermissions.asFileAttribute(fromString);
            return asFileAttribute;
        }

        public static /* synthetic */ FileAttribute h() {
            FileSystem fileSystem;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("unrecognized FileSystem type ");
            fileSystem = FileSystems.getDefault();
            sb2.append(fileSystem);
            throw new IOException(sb2.toString());
        }

        public static /* synthetic */ FileAttribute i(IOException iOException) {
            throw new IOException("Could not find user", iOException);
        }

        public static String k() {
            String value = StandardSystemProperty.USER_NAME.value();
            Objects.requireNonNull(value);
            try {
                Class<?> cls = Class.forName("java.lang.ProcessHandle");
                Class<?> cls2 = Class.forName("java.lang.ProcessHandle$Info");
                Class<?> cls3 = Class.forName("java.util.Optional");
                Method method = cls.getMethod("current", null);
                Method method2 = cls.getMethod("info", null);
                Object invoke = cls3.getMethod("orElse", Object.class).invoke(cls2.getMethod("user", null).invoke(method2.invoke(method.invoke(null, null), null), null), value);
                Objects.requireNonNull(invoke);
                return (String) invoke;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException unused) {
                return value;
            } catch (InvocationTargetException e11) {
                ho.t0.w(e11.getCause());
                return value;
            }
        }

        public static b l() {
            FileSystem fileSystem;
            UserPrincipalLookupService userPrincipalLookupService;
            UserPrincipal lookupPrincipalByName;
            AclEntry.Builder newBuilder;
            AclEntryType aclEntryType;
            AclEntry.Builder type;
            AclEntry.Builder principal;
            AclEntry.Builder permissions;
            AclEntryFlag aclEntryFlag;
            AclEntryFlag aclEntryFlag2;
            AclEntry.Builder flags;
            AclEntry build;
            try {
                fileSystem = FileSystems.getDefault();
                userPrincipalLookupService = fileSystem.getUserPrincipalLookupService();
                lookupPrincipalByName = userPrincipalLookupService.lookupPrincipalByName(k());
                newBuilder = AclEntry.newBuilder();
                aclEntryType = AclEntryType.ALLOW;
                type = newBuilder.setType(aclEntryType);
                principal = type.setPrincipal(lookupPrincipalByName);
                permissions = principal.setPermissions((Set<AclEntryPermission>) EnumSet.allOf(q0.a()));
                aclEntryFlag = AclEntryFlag.DIRECTORY_INHERIT;
                aclEntryFlag2 = AclEntryFlag.FILE_INHERIT;
                flags = permissions.setFlags(aclEntryFlag, aclEntryFlag2);
                build = flags.build();
                final a aVar = new a(ImmutableList.of(build));
                return new b() { // from class: po.f1
                    @Override // po.h0.c.b
                    public final FileAttribute get() {
                        return h0.c.g(aVar);
                    }
                };
            } catch (IOException e11) {
                return new b() { // from class: po.g1
                    @Override // po.h0.c.b
                    public final FileAttribute get() {
                        return h0.c.i(e11);
                    }
                };
            }
        }

        @Override // po.h0
        public File a() {
            Path path;
            Path createTempDirectory;
            File file;
            try {
                path = Paths.get(StandardSystemProperty.JAVA_IO_TMPDIR.value(), new String[0]);
                createTempDirectory = Files.createTempDirectory(path, null, f81055c.get());
                file = createTempDirectory.toFile();
                return file;
            } catch (IOException e11) {
                throw new IllegalStateException("Failed to create directory", e11);
            }
        }

        @Override // po.h0
        public File b(String prefix) throws IOException {
            Path path;
            Path createTempFile;
            File file;
            path = Paths.get(StandardSystemProperty.JAVA_IO_TMPDIR.value(), new String[0]);
            createTempFile = Files.createTempFile(path, prefix, null, f81054b.get());
            file = createTempFile.toFile();
            return file;
        }

        public static /* synthetic */ FileAttribute g(FileAttribute fileAttribute) {
            return fileAttribute;
        }
    }
}
