package ce;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.jiongji.andriod.card.R;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class b extends be.f {

    /* renamed from: i, reason: collision with root package name */
    public static final int f8524i = 8;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f8525b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Triple<Integer, Integer, Integer> f8526c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8527d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Pair<Integer, Integer> f8528e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f8529f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8530g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final x00.a<View> f8531h;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k Context context, @k Triple<Integer, Integer, Integer> guiderViewIds, int i11, @k Pair<Integer, Integer> extendedDiff, @k String key, int i12, @l x00.a<? extends View> aVar) {
        g0.p(context, "context");
        g0.p(guiderViewIds, "guiderViewIds");
        g0.p(extendedDiff, "extendedDiff");
        g0.p(key, "key");
        this.f8525b = context;
        this.f8526c = guiderViewIds;
        this.f8527d = i11;
        this.f8528e = extendedDiff;
        this.f8529f = key;
        this.f8530g = i12;
        this.f8531h = aVar;
    }

    @Override // be.k
    @k
    public Triple<Integer, Integer, Integer> A() {
        return this.f8526c;
    }

    @Override // be.f, be.k
    public int E() {
        return this.f8527d;
    }

    @Override // be.f, be.k
    @k
    public Pair<Integer, Integer> I() {
        return this.f8528e;
    }

    @Override // be.f, be.k
    @l
    public x00.a<View> f() {
        return this.f8531h;
    }

    @Override // be.k
    @k
    public Context getContext() {
        return this.f8525b;
    }

    @Override // be.m
    @k
    public String getKey() {
        return this.f8529f;
    }

    @Override // be.f, be.k
    public int getWeight() {
        return this.f8530g;
    }

    public /* synthetic */ b(Context context, Triple triple, int i11, Pair pair, String str, int i12, x00.a aVar, int i13, v vVar) {
        this(context, (i13 & 2) != 0 ? new Triple(Integer.valueOf(R.layout.layout_main_calendar_parsing), Integer.valueOf(R.id.main_guide_ocr_words_parse), Integer.valueOf(R.id.anchor)) : triple, (i13 & 4) != 0 ? xb.f.a(context, 8.0f) : i11, (i13 & 8) != 0 ? new Pair(Integer.valueOf(xb.f.a(context, 0.0f)), Integer.valueOf(xb.f.a(context, 0.0f))) : pair, (i13 & 16) != 0 ? i9.f.f60400w : str, (i13 & 32) != 0 ? 1 : i12, (i13 & 64) != 0 ? null : aVar);
    }
}
