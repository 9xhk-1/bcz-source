package xf;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.examassistant.data.MarkedWord;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final g f98042a = new g();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final ConcurrentHashMap<Long, List<MarkedWord>> f98043b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public static final int f98044c = 8;

    @k
    public final ConcurrentHashMap<Long, List<MarkedWord>> a() {
        return f98043b;
    }
}
