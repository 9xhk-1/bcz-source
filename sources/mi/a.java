package mi;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.wikiv2.activity.WikiBasicInfo;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f73267a = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final ConcurrentHashMap<Long, List<WikiBasicInfo>> f73268b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public static final int f73269c = 8;

    @k
    public final ConcurrentHashMap<Long, List<WikiBasicInfo>> a() {
        return f73268b;
    }
}
