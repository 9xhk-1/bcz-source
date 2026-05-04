package al;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List<ImageHeaderParser> f2669a = new ArrayList();

    public synchronized void a(@NonNull ImageHeaderParser imageHeaderParser) {
        this.f2669a.add(imageHeaderParser);
    }

    @NonNull
    public synchronized List<ImageHeaderParser> b() {
        return this.f2669a;
    }
}
