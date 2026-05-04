package kc;

import a00.a0;
import a00.r0;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.aigestudio.wheelpicker.WheelPicker;
import java.util.ArrayList;
import java.util.Calendar;
import kc.e;
import kc.z;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import org.junit.jupiter.api.j2;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class m extends z {

    @m80.k
    public static final b T = new b(null);
    public static final String U = m.class.getSimpleName();
    public static final long V = 1900;
    public static final int W = -20;

    @m80.k
    public static final String X = "date_default";

    @m80.k
    public x00.a<g2> Q = d.f66425a;

    @m80.l
    public c R;
    public boolean S;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends e.a<a, m> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k Context context) {
            super(context);
            g0.p(context, "context");
        }

        public static /* synthetic */ a Q(a aVar, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = "";
            }
            if ((i11 & 2) != 0) {
                str2 = "";
            }
            if ((i11 & 4) != 0) {
                str3 = "";
            }
            return aVar.P(str, str2, str3);
        }

        @Override // kc.d.a
        @m80.k
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public m g() {
            return new m();
        }

        @m80.k
        public final a O(long j11) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j11);
            P(String.valueOf(calendar.get(1)), String.valueOf(calendar.get(2) + 1), String.valueOf(calendar.get(5)));
            return this;
        }

        @m80.k
        public final a P(@m80.k String year, @m80.k String month, @m80.k String day) {
            g0.p(year, "year");
            g0.p(month, "month");
            g0.p(day, "day");
            h().putStringArray(m.X, new String[]{year, month, day});
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
        void a(@m80.k String str, @m80.k String str2, @m80.k String str3);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends Lambda implements x00.a<g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f66425a = new d();

        public d() {
            super(0);
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ g2 invoke() {
            invoke2();
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends Lambda implements x00.a<g2> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lc.g f66427b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String[] f66428c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(lc.g gVar, String[] strArr) {
            super(0);
            this.f66427b = gVar;
            this.f66428c = strArr;
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ g2 invoke() {
            invoke2();
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            m mVar = m.this;
            WheelPicker wheelPicker = this.f66427b.f71076c;
            g0.o(wheelPicker, "binding.left");
            ArrayList<?> m02 = mVar.m0(wheelPicker);
            if (m02 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            }
            int parseInt = Integer.parseInt((String) m02.get(m.this.p0()));
            m mVar2 = m.this;
            WheelPicker wheelPicker2 = this.f66427b.f71075b;
            g0.o(wheelPicker2, "binding.center");
            ArrayList<?> m03 = mVar2.m0(wheelPicker2);
            if (m03 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            }
            ArrayList<String> a11 = mc.e.a(parseInt, Integer.parseInt((String) m03.get(m.this.o0())));
            m mVar3 = m.this;
            lc.g gVar = this.f66427b;
            String[] strArr = this.f66428c;
            WheelPicker wheelPicker3 = gVar.f71077d;
            g0.o(wheelPicker3, "binding.right");
            mVar3.x0(wheelPicker3, a11);
            if (!mVar3.S) {
                mVar3.S = true;
                WheelPicker wheelPicker4 = gVar.f71077d;
                int I0 = m.I0(mVar3, a11, (String) a0.hf(strArr, 2), 0, 4, null);
                mVar3.C0(I0);
                wheelPicker4.s(I0, false);
                return;
            }
            int min = Math.min(a11.size() - 1, mVar3.q0());
            Log.d(m.U, "update right index from " + mVar3.q0() + " to " + min);
            mVar3.C0(min);
        }
    }

    public static /* synthetic */ int I0(m mVar, ArrayList arrayList, String str, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return mVar.H0(arrayList, str, i11);
    }

    public static final void J0(m this$0, lc.g binding, int i11, int i12, int i13) {
        g0.p(this$0, "this$0");
        g0.p(binding, "$binding");
        c cVar = this$0.R;
        if (cVar == null) {
            return;
        }
        WheelPicker wheelPicker = binding.f71076c;
        g0.o(wheelPicker, "binding.left");
        ArrayList<?> m02 = this$0.m0(wheelPicker);
        if (m02 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
        }
        Object obj = m02.get(i11);
        g0.o(obj, "(binding.left.content as ArrayList<String>)[left]");
        String str = (String) obj;
        WheelPicker wheelPicker2 = binding.f71075b;
        g0.o(wheelPicker2, "binding.center");
        ArrayList<?> m03 = this$0.m0(wheelPicker2);
        if (m03 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
        }
        Object obj2 = m03.get(i12);
        g0.o(obj2, "(binding.center.content …rrayList<String>)[center]");
        String str2 = (String) obj2;
        WheelPicker wheelPicker3 = binding.f71077d;
        g0.o(wheelPicker3, "binding.right");
        ArrayList<?> m04 = this$0.m0(wheelPicker3);
        if (m04 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
        }
        Object obj3 = m04.get(i13);
        g0.o(obj3, "(binding.right.content a…ArrayList<String>)[right]");
        cVar.a(str, str2, (String) obj3);
    }

    private final void K0() {
        this.Q.invoke();
    }

    public final int H0(ArrayList<String> arrayList, String str, int i11) {
        Integer num;
        if (str == null || str.length() <= 0) {
            num = null;
        } else {
            int i32 = r0.i3(arrayList, str);
            if (i32 == -1) {
                i32 = 0;
            }
            num = Integer.valueOf(i32);
        }
        return num == null ? i11 : num.intValue();
    }

    @m80.k
    public final m L0(@m80.k c onDateListener) {
        g0.p(onDateListener, "onDateListener");
        this.R = onDateListener;
        return this;
    }

    @Override // kc.z
    public void r0(@m80.k final lc.g binding) {
        g0.p(binding, "binding");
        Bundle arguments = getArguments();
        String[] stringArray = arguments == null ? null : arguments.getStringArray(X);
        if (stringArray == null) {
            stringArray = new String[0];
        }
        ArrayList<String> i11 = mc.e.i(V);
        WheelPicker wheelPicker = binding.f71076c;
        g0.o(wheelPicker, "binding.left");
        x0(wheelPicker, i11);
        WheelPicker wheelPicker2 = binding.f71076c;
        int H0 = H0(i11, (String) a0.hf(stringArray, 0), i11.size() - 21);
        B0(H0);
        wheelPicker2.s(H0, false);
        ArrayList<String> e11 = mc.e.e();
        WheelPicker wheelPicker3 = binding.f71075b;
        g0.o(wheelPicker3, "binding.center");
        x0(wheelPicker3, e11);
        WheelPicker wheelPicker4 = binding.f71075b;
        int I0 = I0(this, e11, (String) a0.hf(stringArray, 1), 0, 4, null);
        A0(I0);
        wheelPicker4.s(I0, false);
        e eVar = new e(binding, stringArray);
        this.Q = eVar;
        eVar.invoke();
        z0(new z.c() { // from class: kc.l
            @Override // kc.z.c
            public final void a(int i12, int i13, int i14) {
                m.J0(m.this, binding, i12, i13, i14);
            }
        });
    }

    @Override // kc.z
    public void s0(int i11, int i12) {
        Log.d(U, "onItemSelectedChanged: " + i11 + j2.O + i12);
        if (i11 != 2) {
            K0();
        }
    }
}
