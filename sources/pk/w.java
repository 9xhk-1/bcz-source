package pk;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.InputStream;
import pk.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class w<Data> implements o<String, Data> {

    /* renamed from: a, reason: collision with root package name */
    public final o<Uri, Data> f80768a;

    public w(o<Uri, Data> oVar) {
        this.f80768a = oVar;
    }

    @Nullable
    public static Uri c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return d(str);
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() == null ? d(str) : parse;
    }

    public static Uri d(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // pk.o
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public o.a<Data> buildLoadData(@NonNull String str, int i11, int i12, @NonNull ik.e eVar) {
        Uri c11 = c(str);
        if (c11 == null || !this.f80768a.handles(c11)) {
            return null;
        }
        return this.f80768a.buildLoadData(c11, i11, i12, eVar);
    }

    @Override // pk.o
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(@NonNull String str) {
        return true;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements p<String, AssetFileDescriptor> {
        @Override // pk.p
        public o<String, AssetFileDescriptor> build(@NonNull s sVar) {
            return new w(sVar.d(Uri.class, AssetFileDescriptor.class));
        }

        @Override // pk.p
        public void teardown() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements p<String, ParcelFileDescriptor> {
        @Override // pk.p
        @NonNull
        public o<String, ParcelFileDescriptor> build(@NonNull s sVar) {
            return new w(sVar.d(Uri.class, ParcelFileDescriptor.class));
        }

        @Override // pk.p
        public void teardown() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements p<String, InputStream> {
        @Override // pk.p
        @NonNull
        public o<String, InputStream> build(@NonNull s sVar) {
            return new w(sVar.d(Uri.class, InputStream.class));
        }

        @Override // pk.p
        public void teardown() {
        }
    }
}
