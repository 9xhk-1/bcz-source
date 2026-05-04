package kc;

import a00.a0;
import a00.r0;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.aigestudio.wheelpicker.WheelPicker;
import com.baicizhan.framework.common.magicdialog.ButtonType;
import java.util.ArrayList;
import java.util.List;
import kc.e;
import kotlin.jvm.internal.g0;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class z extends i {

    @m80.k
    public static final b I = new b(null);
    public static final String J = z.class.getSimpleName();

    @m80.k
    public static final String K = "wheels_left";

    @m80.k
    public static final String L = "wheels_center";

    @m80.k
    public static final String M = "wheels_right";
    public static final int N = 0;
    public static final int O = 1;
    public static final int P = 2;
    public int E;
    public int F;
    public int G;

    @m80.l
    public c H;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends e.a<a, z> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k Context context) {
            super(context);
            g0.p(context, "context");
        }

        @Override // kc.d.a
        @m80.k
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public z g() {
            return new z();
        }

        @m80.k
        public final a O(@m80.k ArrayList<String>... list) {
            g0.p(list, "list");
            int length = list.length;
            if (1 > length || length >= 4) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            ArrayList<String> arrayList = (ArrayList) a0.hf(list, 0);
            if (arrayList != null) {
                h().putStringArrayList(z.K, arrayList);
            }
            ArrayList<String> arrayList2 = (ArrayList) a0.hf(list, 1);
            if (arrayList2 != null) {
                h().putStringArrayList(z.L, arrayList2);
            }
            ArrayList<String> arrayList3 = (ArrayList) a0.hf(list, 2);
            if (arrayList3 == null) {
                return this;
            }
            h().putStringArrayList(z.M, arrayList3);
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void a(int i11, int i12, int i13);
    }

    public static final void u0(z this$0, WheelPicker wheelPicker, Object obj, int i11) {
        g0.p(this$0, "this$0");
        this$0.E = i11;
        Log.d(J, "left: " + i11 + " -> [" + this$0.E + j2.O + this$0.F + j2.O + this$0.G + l50.b.f69930l);
        this$0.s0(0, i11);
    }

    public static final void v0(z this$0, WheelPicker wheelPicker, Object obj, int i11) {
        g0.p(this$0, "this$0");
        this$0.F = i11;
        Log.d(J, "center: " + i11 + " -> [" + this$0.E + j2.O + this$0.F + j2.O + this$0.G + l50.b.f69930l);
        this$0.s0(1, i11);
    }

    public static final void w0(z this$0, WheelPicker wheelPicker, Object obj, int i11) {
        g0.p(this$0, "this$0");
        this$0.G = i11;
        Log.d(J, "right: " + i11 + " -> [" + this$0.E + j2.O + this$0.F + j2.O + this$0.G + l50.b.f69930l);
        this$0.s0(2, i11);
    }

    public final void A0(int i11) {
        this.F = i11;
    }

    public final void B0(int i11) {
        this.E = i11;
    }

    public final void C0(int i11) {
        this.G = i11;
    }

    @Override // kc.d
    @m80.k
    public ButtonType O() {
        return ButtonType.DOUBLE;
    }

    @Override // kc.d
    public void d0(@m80.k TextView v11) {
        g0.p(v11, "v");
        c cVar = this.H;
        if (cVar == null) {
            return;
        }
        cVar.a(this.E, this.F, this.G);
    }

    @Override // kc.i
    @m80.k
    public View i0(@m80.k LayoutInflater inflater) {
        g0.p(inflater, "inflater");
        lc.g c11 = lc.g.c(inflater);
        g0.o(c11, "this");
        r0(c11);
        t0(c11);
        LinearLayout root = c11.getRoot();
        g0.o(root, "inflate(inflater).apply …ener(this)\n        }.root");
        return root;
    }

    @m80.l
    public final ArrayList<?> m0(@m80.k WheelPicker wheelPicker) {
        g0.p(wheelPicker, "<this>");
        List data = wheelPicker.getData();
        if (data instanceof ArrayList) {
            return (ArrayList) data;
        }
        return null;
    }

    @m80.l
    public final c n0() {
        return this.H;
    }

    public final int o0() {
        return this.F;
    }

    public final int p0() {
        return this.E;
    }

    public final int q0() {
        return this.G;
    }

    public void r0(@m80.k lc.g binding) {
        g0.p(binding, "binding");
        WheelPicker wheelPicker = binding.f71076c;
        g0.o(wheelPicker, "binding.left");
        Bundle arguments = getArguments();
        x0(wheelPicker, arguments == null ? null : arguments.getStringArrayList(K));
        WheelPicker wheelPicker2 = binding.f71075b;
        g0.o(wheelPicker2, "binding.center");
        Bundle arguments2 = getArguments();
        x0(wheelPicker2, arguments2 == null ? null : arguments2.getStringArrayList(L));
        WheelPicker wheelPicker3 = binding.f71077d;
        g0.o(wheelPicker3, "binding.right");
        Bundle arguments3 = getArguments();
        x0(wheelPicker3, arguments3 != null ? arguments3.getStringArrayList(M) : null);
    }

    public final void t0(lc.g gVar) {
        WheelPicker wheelPicker = gVar.f71076c;
        g0.o(wheelPicker, "binding.left");
        if (am.a.d(wheelPicker)) {
            gVar.f71076c.setOnItemSelectedListener(new WheelPicker.a() { // from class: kc.w
                @Override // com.aigestudio.wheelpicker.WheelPicker.a
                public final void W(WheelPicker wheelPicker2, Object obj, int i11) {
                    z.u0(z.this, wheelPicker2, obj, i11);
                }
            });
        }
        WheelPicker wheelPicker2 = gVar.f71075b;
        g0.o(wheelPicker2, "binding.center");
        if (am.a.d(wheelPicker2)) {
            gVar.f71075b.setOnItemSelectedListener(new WheelPicker.a() { // from class: kc.x
                @Override // com.aigestudio.wheelpicker.WheelPicker.a
                public final void W(WheelPicker wheelPicker3, Object obj, int i11) {
                    z.v0(z.this, wheelPicker3, obj, i11);
                }
            });
        }
        WheelPicker wheelPicker3 = gVar.f71077d;
        g0.o(wheelPicker3, "binding.right");
        if (am.a.d(wheelPicker3)) {
            gVar.f71077d.setOnItemSelectedListener(new WheelPicker.a() { // from class: kc.y
                @Override // com.aigestudio.wheelpicker.WheelPicker.a
                public final void W(WheelPicker wheelPicker4, Object obj, int i11) {
                    z.w0(z.this, wheelPicker4, obj, i11);
                }
            });
        }
    }

    public final void x0(@m80.k WheelPicker wheelPicker, @m80.l ArrayList<?> arrayList) {
        g0.p(wheelPicker, "<this>");
        am.a.o(wheelPicker, arrayList != null);
        List a62 = arrayList == null ? null : r0.a6(arrayList);
        if (a62 == null) {
            return;
        }
        wheelPicker.setData(a62);
    }

    public final void y0(@m80.l c cVar) {
        this.H = cVar;
    }

    @m80.k
    public final z z0(@m80.k c interaction) {
        g0.p(interaction, "interaction");
        this.H = interaction;
        return this;
    }

    public void s0(int i11, int i12) {
    }
}
