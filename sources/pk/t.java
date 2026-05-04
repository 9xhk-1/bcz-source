package pk;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;
import pk.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class t<Data> implements o<Integer, Data> {

    /* renamed from: c, reason: collision with root package name */
    public static final String f80753c = "ResourceLoader";

    /* renamed from: a, reason: collision with root package name */
    public final o<Uri, Data> f80754a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f80755b;

    public t(Resources resources, o<Uri, Data> oVar) {
        this.f80755b = resources;
        this.f80754a = oVar;
    }

    @Override // pk.o
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public o.a<Data> buildLoadData(@NonNull Integer num, int i11, int i12, @NonNull ik.e eVar) {
        Uri b11 = b(num);
        if (b11 == null) {
            return null;
        }
        return this.f80754a.buildLoadData(b11, i11, i12, eVar);
    }

    @Nullable
    public final Uri b(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f80755b.getResourcePackageName(num.intValue()) + '/' + num);
        } catch (Resources.NotFoundException e11) {
            if (!Log.isLoggable(f80753c, 5)) {
                return null;
            }
            Log.w(f80753c, "Received invalid resource id: " + num, e11);
            return null;
        }
    }

    @Override // pk.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean handles(@NonNull Integer num) {
        return true;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements p<Integer, AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f80756a;

        public a(Resources resources) {
            this.f80756a = resources;
        }

        @Override // pk.p
        public o<Integer, AssetFileDescriptor> build(s sVar) {
            return new t(this.f80756a, sVar.d(Uri.class, AssetFileDescriptor.class));
        }

        @Override // pk.p
        public void teardown() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Deprecated
    public static class b implements p<Integer, ParcelFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f80757a;

        public b(Resources resources) {
            this.f80757a = resources;
        }

        @Override // pk.p
        @NonNull
        public o<Integer, ParcelFileDescriptor> build(s sVar) {
            return new t(this.f80757a, sVar.d(Uri.class, ParcelFileDescriptor.class));
        }

        @Override // pk.p
        public void teardown() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements p<Integer, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f80758a;

        public c(Resources resources) {
            this.f80758a = resources;
        }

        @Override // pk.p
        @NonNull
        public o<Integer, InputStream> build(s sVar) {
            return new t(this.f80758a, sVar.d(Uri.class, InputStream.class));
        }

        @Override // pk.p
        public void teardown() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements p<Integer, Uri> {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f80759a;

        public d(Resources resources) {
            this.f80759a = resources;
        }

        @Override // pk.p
        @NonNull
        public o<Integer, Uri> build(s sVar) {
            return new t(this.f80759a, x.a());
        }

        @Override // pk.p
        public void teardown() {
        }
    }
}
