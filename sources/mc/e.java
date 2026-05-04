package mc;

import android.os.Build;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import kc.m;
import kc.p;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final String f73095a = "magic_loading";

    @k
    public static final ArrayList<String> a(int i11, int i12) {
        int actualMaximum;
        YearMonth of2;
        int i13 = 1;
        if (Build.VERSION.SDK_INT >= 26) {
            of2 = YearMonth.of(i11, i12);
            actualMaximum = of2.lengthOfMonth();
        } else {
            actualMaximum = new GregorianCalendar(i11, i12 - 1, 1).getActualMaximum(5);
        }
        ArrayList<String> arrayList = new ArrayList<>(12);
        if (1 <= actualMaximum) {
            while (true) {
                int i14 = i13 + 1;
                arrayList.add(String.valueOf(i13));
                if (i13 == actualMaximum) {
                    break;
                }
                i13 = i14;
            }
        }
        return arrayList;
    }

    public static final boolean b(@k AppCompatActivity appCompatActivity) {
        g0.p(appCompatActivity, "<this>");
        FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        g0.o(supportFragmentManager, "supportFragmentManager");
        return c(supportFragmentManager);
    }

    public static final boolean c(FragmentManager fragmentManager) {
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag(f73095a);
        p pVar = findFragmentByTag instanceof p ? (p) findFragmentByTag : null;
        return pVar != null && pVar.isAdded() && pVar.isVisible();
    }

    public static final void d(@k String[] args) {
        g0.p(args, "args");
        ArrayList<String> i11 = i(m.V);
        System.out.println((Object) ("last: " + i11.get(i11.size() - 1) + ",  size: " + i11.size()));
    }

    @k
    public static final ArrayList<String> e() {
        ArrayList<String> arrayList = new ArrayList<>(12);
        for (int i11 = 1; i11 < 13; i11++) {
            arrayList.add(String.valueOf(i11));
        }
        return arrayList;
    }

    public static final void f(@k AppCompatActivity appCompatActivity, boolean z11) {
        g0.p(appCompatActivity, "<this>");
        FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        g0.o(supportFragmentManager, "supportFragmentManager");
        h(supportFragmentManager, z11);
    }

    public static final void g(@k Fragment fragment, boolean z11) {
        g0.p(fragment, "<this>");
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        g0.o(childFragmentManager, "childFragmentManager");
        h(childFragmentManager, z11);
    }

    public static final void h(FragmentManager fragmentManager, boolean z11) {
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag(f73095a);
        if ((findFragmentByTag == null || !findFragmentByTag.isAdded()) && z11) {
            new p().show(fragmentManager, f73095a);
            return;
        }
        if (findFragmentByTag == null || z11) {
            return;
        }
        p pVar = findFragmentByTag instanceof p ? (p) findFragmentByTag : null;
        if (pVar == null) {
            return;
        }
        pVar.dismiss();
    }

    @k
    public static final ArrayList<String> i(long j11) {
        int i11 = Calendar.getInstance().get(1);
        ArrayList<String> arrayList = new ArrayList<>(150);
        long j12 = i11;
        if (j11 <= j12) {
            while (true) {
                long j13 = 1 + j11;
                arrayList.add(String.valueOf(j11));
                if (j11 == j12) {
                    break;
                }
                j11 = j13;
            }
        }
        return arrayList;
    }
}
