package kk;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f66721a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final j f66722b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final j f66723c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final j f66724d = new d();

    /* renamed from: e, reason: collision with root package name */
    public static final j f66725e = new e();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends j {
        @Override // kk.j
        public boolean a() {
            return true;
        }

        @Override // kk.j
        public boolean b() {
            return true;
        }

        @Override // kk.j
        public boolean c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // kk.j
        public boolean d(boolean z11, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends j {
        @Override // kk.j
        public boolean a() {
            return false;
        }

        @Override // kk.j
        public boolean b() {
            return false;
        }

        @Override // kk.j
        public boolean c(DataSource dataSource) {
            return false;
        }

        @Override // kk.j
        public boolean d(boolean z11, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends j {
        @Override // kk.j
        public boolean a() {
            return true;
        }

        @Override // kk.j
        public boolean b() {
            return false;
        }

        @Override // kk.j
        public boolean c(DataSource dataSource) {
            return (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }

        @Override // kk.j
        public boolean d(boolean z11, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends j {
        @Override // kk.j
        public boolean a() {
            return false;
        }

        @Override // kk.j
        public boolean b() {
            return true;
        }

        @Override // kk.j
        public boolean c(DataSource dataSource) {
            return false;
        }

        @Override // kk.j
        public boolean d(boolean z11, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends j {
        @Override // kk.j
        public boolean a() {
            return true;
        }

        @Override // kk.j
        public boolean b() {
            return true;
        }

        @Override // kk.j
        public boolean c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // kk.j
        public boolean d(boolean z11, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z11 && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(DataSource dataSource);

    public abstract boolean d(boolean z11, DataSource dataSource, EncodeStrategy encodeStrategy);
}
