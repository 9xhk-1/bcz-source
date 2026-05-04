package ce;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.jiongji.andriod.card.R;
import kotlin.Triple;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class f extends be.f {

    /* renamed from: f, reason: collision with root package name */
    public static final int f8541f = 8;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f8542b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Triple<Integer, Integer, Integer> f8543c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f8544d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8545e;

    public f(@k Context context, @k Triple<Integer, Integer, Integer> guiderViewIds, @k String key, boolean z11) {
        g0.p(context, "context");
        g0.p(guiderViewIds, "guiderViewIds");
        g0.p(key, "key");
        this.f8542b = context;
        this.f8543c = guiderViewIds;
        this.f8544d = key;
        this.f8545e = z11;
    }

    @Override // be.k
    @k
    public Triple<Integer, Integer, Integer> A() {
        return this.f8543c;
    }

    @Override // be.k
    @k
    public Context getContext() {
        return this.f8542b;
    }

    @Override // be.m
    @k
    public String getKey() {
        return this.f8544d;
    }

    @Override // be.f, be.k
    public boolean v() {
        return this.f8545e;
    }

    public /* synthetic */ f(Context context, Triple triple, String str, boolean z11, int i11, v vVar) {
        this(context, (i11 & 2) != 0 ? new Triple(Integer.valueOf(R.layout.layout_guide_ocr_words_camera_taken), Integer.valueOf(R.id.guide_ocr_camera_taken), null) : triple, (i11 & 4) != 0 ? i9.f.f60401x : str, (i11 & 8) != 0 ? true : z11);
    }
}
