package jt;

import android.os.Build;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import mt.f;
import mt.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    public static final String f64665c = "PermissionCollection";

    /* renamed from: a, reason: collision with root package name */
    public FragmentActivity f64666a;

    /* renamed from: b, reason: collision with root package name */
    public Fragment f64667b;

    public b(FragmentActivity fragmentActivity) {
        this.f64666a = fragmentActivity;
    }

    public f a(List<String> list) {
        boolean z11;
        HashSet hashSet = new HashSet(list);
        HashSet hashSet2 = new HashSet();
        if (hashSet.contains(g.f73723e)) {
            int i11 = Build.VERSION.SDK_INT;
            Fragment fragment = this.f64667b;
            int i12 = (fragment == null || fragment.getContext() == null) ? this.f64666a.getApplicationInfo().targetSdkVersion : this.f64667b.getContext().getApplicationInfo().targetSdkVersion;
            if (i11 >= 30 && i12 >= 30) {
                hashSet.remove(g.f73723e);
                z11 = true;
                return new f(this.f64666a, this.f64667b, hashSet, z11, hashSet2);
            }
            if (i11 < 29) {
                hashSet.remove(g.f73723e);
                hashSet2.add(g.f73723e);
            }
        }
        z11 = false;
        return new f(this.f64666a, this.f64667b, hashSet, z11, hashSet2);
    }

    public f b(String... strArr) {
        return a(new ArrayList(Arrays.asList(strArr)));
    }

    public b(Fragment fragment) {
        this.f64667b = fragment;
    }
}
