package pk;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;
import pk.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class f<DataT> implements o<Integer, DataT> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f80681a;

    /* renamed from: b, reason: collision with root package name */
    public final e<DataT> f80682b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface e<DataT> {
        void a(DataT datat) throws IOException;

        DataT b(@Nullable Resources.Theme theme, Resources resources, int i11);

        Class<DataT> getDataClass();
    }

    public f(Context context, e<DataT> eVar) {
        this.f80681a = context.getApplicationContext();
        this.f80682b = eVar;
    }

    public static p<Integer, AssetFileDescriptor> a(Context context) {
        return new a(context);
    }

    public static p<Integer, Drawable> c(Context context) {
        return new b(context);
    }

    public static p<Integer, InputStream> e(Context context) {
        return new c(context);
    }

    @Override // pk.o
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public o.a<DataT> buildLoadData(@NonNull Integer num, int i11, int i12, @NonNull ik.e eVar) {
        Resources.Theme theme = (Resources.Theme) eVar.c(uk.k.f92271b);
        return new o.a<>(new el.e(num), new d(theme, theme != null ? theme.getResources() : this.f80681a.getResources(), this.f80682b, num.intValue()));
    }

    @Override // pk.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean handles(@NonNull Integer num) {
        return true;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements p<Integer, AssetFileDescriptor>, e<AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f80683a;

        public a(Context context) {
            this.f80683a = context;
        }

        @Override // pk.p
        @NonNull
        public o<Integer, AssetFileDescriptor> build(@NonNull s sVar) {
            return new f(this.f80683a, this);
        }

        @Override // pk.f.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // pk.f.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public AssetFileDescriptor b(@Nullable Resources.Theme theme, Resources resources, int i11) {
            return resources.openRawResourceFd(i11);
        }

        @Override // pk.f.e
        public Class<AssetFileDescriptor> getDataClass() {
            return AssetFileDescriptor.class;
        }

        @Override // pk.p
        public void teardown() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements p<Integer, Drawable>, e<Drawable> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f80684a;

        public b(Context context) {
            this.f80684a = context;
        }

        @Override // pk.p
        @NonNull
        public o<Integer, Drawable> build(@NonNull s sVar) {
            return new f(this.f80684a, this);
        }

        @Override // pk.f.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Drawable b(@Nullable Resources.Theme theme, Resources resources, int i11) {
            return uk.g.a(this.f80684a, i11, theme);
        }

        @Override // pk.f.e
        public Class<Drawable> getDataClass() {
            return Drawable.class;
        }

        @Override // pk.p
        public void teardown() {
        }

        @Override // pk.f.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Drawable drawable) throws IOException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements p<Integer, InputStream>, e<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f80685a;

        public c(Context context) {
            this.f80685a = context;
        }

        @Override // pk.p
        @NonNull
        public o<Integer, InputStream> build(@NonNull s sVar) {
            return new f(this.f80685a, this);
        }

        @Override // pk.f.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // pk.f.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public InputStream b(@Nullable Resources.Theme theme, Resources resources, int i11) {
            return resources.openRawResource(i11);
        }

        @Override // pk.f.e
        public Class<InputStream> getDataClass() {
            return InputStream.class;
        }

        @Override // pk.p
        public void teardown() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        public final Resources.Theme f80686a;

        /* renamed from: b, reason: collision with root package name */
        public final Resources f80687b;

        /* renamed from: c, reason: collision with root package name */
        public final e<DataT> f80688c;

        /* renamed from: d, reason: collision with root package name */
        public final int f80689d;

        /* renamed from: e, reason: collision with root package name */
        @Nullable
        public DataT f80690e;

        public d(@Nullable Resources.Theme theme, Resources resources, e<DataT> eVar, int i11) {
            this.f80686a = theme;
            this.f80687b = resources;
            this.f80688c = eVar;
            this.f80689d = i11;
        }

        @Override // com.bumptech.glide.load.data.d
        public void cleanup() {
            DataT datat = this.f80690e;
            if (datat != null) {
                try {
                    this.f80688c.a(datat);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<DataT> getDataClass() {
            return this.f80688c.getDataClass();
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [DataT, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public void loadData(@NonNull Priority priority, @NonNull d.a<? super DataT> aVar) {
            try {
                DataT b11 = this.f80688c.b(this.f80686a, this.f80687b, this.f80689d);
                this.f80690e = b11;
                aVar.b(b11);
            } catch (Resources.NotFoundException e11) {
                aVar.c(e11);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
