package be;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.jiongji.andriod.card.R;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public abstract class f implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final int f6775a = 0;

    public static final void L(f fVar, x00.a aVar, View view) {
        fVar.b();
        aVar.invoke();
    }

    @Override // be.k
    public void B(@m80.k ViewGroup parent, @m80.k View guideView, @m80.l View view, @m80.l Rect rect, @m80.k final x00.a<g2> onDismiss) {
        g0.p(parent, "parent");
        g0.p(guideView, "guideView");
        g0.p(onDismiss, "onDismiss");
        super.B(parent, guideView, view, rect, onDismiss);
        TextView textView = (TextView) guideView.findViewById(R.id.confirm);
        if (textView == null) {
            throw new RuntimeException("ConfirmGuider needs a button with id 'confirm'");
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: be.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                f.L(f.this, onDismiss, view2);
            }
        });
    }

    @Override // be.k
    public /* bridge */ int D() {
        return super.D();
    }

    @Override // be.k
    public /* bridge */ int E() {
        return super.E();
    }

    @Override // be.k
    @m80.k
    public /* bridge */ Pair<Integer, Integer> I() {
        return super.I();
    }

    @Override // be.m, be.k
    public /* bridge */ boolean a() {
        return super.a();
    }

    @Override // be.m, be.k
    public /* bridge */ void b() {
        super.b();
    }

    @Override // be.k
    @m80.l
    public /* bridge */ x00.a<View> f() {
        return super.f();
    }

    @Override // be.k
    @m80.l
    public /* bridge */ View getTarget() {
        return super.getTarget();
    }

    @Override // be.k
    public /* bridge */ int getWeight() {
        return super.getWeight();
    }

    @Override // be.k
    public /* bridge */ boolean i() {
        return super.i();
    }

    @Override // be.k
    public /* bridge */ int p() {
        return super.p();
    }

    @Override // be.k
    public boolean r(@m80.k Rect targetRect) {
        g0.p(targetRect, "targetRect");
        return true;
    }

    @Override // be.k
    public /* bridge */ boolean v() {
        return super.v();
    }
}
