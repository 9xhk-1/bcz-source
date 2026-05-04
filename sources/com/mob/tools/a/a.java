package com.mob.tools.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.location.Location;
import android.view.View;
import com.mob.tools.utils.ReflectHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes7.dex */
public interface a {
    String[] A();

    String B();

    int C();

    int D();

    int E();

    int F();

    int G();

    int H();

    int I();

    int J();

    ArrayList<HashMap<String, Object>> K();

    HashMap<String, Object> L();

    ArrayList<HashMap<String, Object>> M();

    boolean N();

    int O();

    String P();

    String Q();

    String R();

    HashMap<String, Object> S();

    ArrayList<ArrayList<String>> T();

    int U();

    int V();

    String W();

    HashMap<String, HashMap<String, Long>> X();

    HashMap<String, Long> Y();

    int Z();

    PackageInfo a(String str, int i11) throws PackageManager.NameNotFoundException;

    Location a(int i11, int i12, boolean z11);

    String a(String str, String str2);

    String a(boolean z11);

    List<ResolveInfo> a(Intent intent, int i11);

    void a(View view);

    void a(ReflectHelper.a<HashMap<String, Object>, Void> aVar);

    boolean a();

    boolean a(String str);

    String aA();

    String aB();

    String aC();

    int aD();

    String aE();

    boolean aF();

    String aG();

    Object aH();

    Context aI();

    String aJ();

    String aK();

    long aL();

    String aa();

    String ab();

    String ac();

    String ad();

    String ae();

    boolean af();

    int ag();

    ArrayList<HashMap<String, String>> ah();

    String ai();

    HashMap<String, Object> aj();

    HashMap<String, String> ak();

    String al();

    String am();

    HashMap<String, Object> an();

    String ao();

    String ap();

    String aq();

    HashMap<String, Object> ar();

    String as();

    ArrayList<HashMap<String, String>> at();

    String au();

    String av();

    String aw();

    HashMap<String, Object> ax();

    ArrayList<HashMap<String, Object>> ay();

    String az();

    ResolveInfo b(Intent intent, int i11);

    String b(String str);

    String b(boolean z11);

    void b(View view);

    boolean b();

    String c(String str);

    ArrayList<HashMap<String, String>> c(boolean z11);

    boolean c();

    String d(boolean z11);

    List<String> d(String str);

    boolean d();

    boolean e();

    boolean e(String str);

    String f(String str);

    boolean f();

    String g(String str);

    boolean g();

    boolean h();

    boolean h(String str) throws Throwable;

    boolean i();

    boolean j();

    boolean k();

    String l();

    String m();

    String n();

    String o();

    String[] p();

    String q();

    String r();

    String s();

    String t();

    String u();

    String v();

    String w();

    String x();

    String y();

    String z();
}
