package jl;

import a3.d0;
import com.badlogic.gdx.utils.a;
import com.esotericsoftware.spine.Animation;
import com.esotericsoftware.spine.BoneData;
import com.esotericsoftware.spine.PathConstraintData;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    @d0
    public String f64358a;

    /* renamed from: e, reason: collision with root package name */
    @d0
    public com.esotericsoftware.spine.h f64362e;

    /* renamed from: l, reason: collision with root package name */
    public float f64369l;

    /* renamed from: m, reason: collision with root package name */
    public float f64370m;

    /* renamed from: n, reason: collision with root package name */
    public float f64371n;

    /* renamed from: o, reason: collision with root package name */
    public float f64372o;

    /* renamed from: q, reason: collision with root package name */
    @d0
    public String f64374q;

    /* renamed from: r, reason: collision with root package name */
    @d0
    public String f64375r;

    /* renamed from: t, reason: collision with root package name */
    @d0
    public String f64377t;

    /* renamed from: u, reason: collision with root package name */
    @d0
    public String f64378u;

    /* renamed from: b, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<BoneData> f64359b = new com.badlogic.gdx.utils.a<>();

    /* renamed from: c, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<n> f64360c = new com.badlogic.gdx.utils.a<>();

    /* renamed from: d, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<com.esotericsoftware.spine.h> f64361d = new com.badlogic.gdx.utils.a<>();

    /* renamed from: f, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<d> f64363f = new com.badlogic.gdx.utils.a<>();

    /* renamed from: g, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<Animation> f64364g = new com.badlogic.gdx.utils.a<>();

    /* renamed from: h, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<e> f64365h = new com.badlogic.gdx.utils.a<>();

    /* renamed from: i, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<o> f64366i = new com.badlogic.gdx.utils.a<>();

    /* renamed from: j, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<PathConstraintData> f64367j = new com.badlogic.gdx.utils.a<>();

    /* renamed from: k, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<f> f64368k = new com.badlogic.gdx.utils.a<>();

    /* renamed from: p, reason: collision with root package name */
    public float f64373p = 100.0f;

    /* renamed from: s, reason: collision with root package name */
    public float f64376s = 30.0f;

    @d0
    public String A() {
        return this.f64374q;
    }

    public float B() {
        return this.f64371n;
    }

    public float C() {
        return this.f64369l;
    }

    public float D() {
        return this.f64370m;
    }

    public void E(@d0 String str) {
        this.f64378u = str;
    }

    public void F(@d0 com.esotericsoftware.spine.h hVar) {
        this.f64362e = hVar;
    }

    public void G(float f11) {
        this.f64376s = f11;
    }

    public void H(@d0 String str) {
        this.f64375r = str;
    }

    public void I(float f11) {
        this.f64372o = f11;
    }

    public void J(@d0 String str) {
        this.f64377t = str;
    }

    public void K(@d0 String str) {
        this.f64358a = str;
    }

    public void L(float f11) {
        this.f64373p = f11;
    }

    public void M(@d0 String str) {
        this.f64374q = str;
    }

    public void N(float f11) {
        this.f64371n = f11;
    }

    public void O(float f11) {
        this.f64369l = f11;
    }

    public void P(float f11) {
        this.f64370m = f11;
    }

    @d0
    public Animation a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("animationName cannot be null.");
        }
        com.badlogic.gdx.utils.a<Animation> aVar = this.f64364g;
        Animation[] animationArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            Animation animation = animationArr[i12];
            if (animation.f29038a.equals(str)) {
                return animation;
            }
        }
        return null;
    }

    @d0
    public BoneData b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("boneName cannot be null.");
        }
        com.badlogic.gdx.utils.a<BoneData> aVar = this.f64359b;
        BoneData[] boneDataArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            BoneData boneData = boneDataArr[i12];
            if (boneData.f29165b.equals(str)) {
                return boneData;
            }
        }
        return null;
    }

    @d0
    public d c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("eventDataName cannot be null.");
        }
        a.b<d> it = this.f64363f.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (next.f64313a.equals(str)) {
                return next;
            }
        }
        return null;
    }

    @d0
    public e d(String str) {
        if (str == null) {
            throw new IllegalArgumentException("constraintName cannot be null.");
        }
        com.badlogic.gdx.utils.a<e> aVar = this.f64365h;
        e[] eVarArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            e eVar = eVarArr[i12];
            if (eVar.f64303a.equals(str)) {
                return eVar;
            }
        }
        return null;
    }

    @d0
    public PathConstraintData e(String str) {
        if (str == null) {
            throw new IllegalArgumentException("constraintName cannot be null.");
        }
        com.badlogic.gdx.utils.a<PathConstraintData> aVar = this.f64367j;
        PathConstraintData[] pathConstraintDataArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            PathConstraintData pathConstraintData = pathConstraintDataArr[i12];
            if (pathConstraintData.f64303a.equals(str)) {
                return pathConstraintData;
            }
        }
        return null;
    }

    @d0
    public f f(String str) {
        if (str == null) {
            throw new IllegalArgumentException("constraintName cannot be null.");
        }
        com.badlogic.gdx.utils.a<f> aVar = this.f64368k;
        f[] fVarArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            f fVar = fVarArr[i12];
            if (fVar.f64303a.equals(str)) {
                return fVar;
            }
        }
        return null;
    }

    @d0
    public com.esotericsoftware.spine.h g(String str) {
        if (str == null) {
            throw new IllegalArgumentException("skinName cannot be null.");
        }
        a.b<com.esotericsoftware.spine.h> it = this.f64361d.iterator();
        while (it.hasNext()) {
            com.esotericsoftware.spine.h next = it.next();
            if (next.f29456a.equals(str)) {
                return next;
            }
        }
        return null;
    }

    @d0
    public n h(String str) {
        if (str == null) {
            throw new IllegalArgumentException("slotName cannot be null.");
        }
        com.badlogic.gdx.utils.a<n> aVar = this.f64360c;
        n[] nVarArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            n nVar = nVarArr[i12];
            if (nVar.f64416b.equals(str)) {
                return nVar;
            }
        }
        return null;
    }

    @d0
    public o i(String str) {
        if (str == null) {
            throw new IllegalArgumentException("constraintName cannot be null.");
        }
        com.badlogic.gdx.utils.a<o> aVar = this.f64366i;
        o[] oVarArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            o oVar = oVarArr[i12];
            if (oVar.f64303a.equals(str)) {
                return oVar;
            }
        }
        return null;
    }

    public com.badlogic.gdx.utils.a<Animation> j() {
        return this.f64364g;
    }

    @d0
    public String k() {
        return this.f64378u;
    }

    public com.badlogic.gdx.utils.a<BoneData> l() {
        return this.f64359b;
    }

    @d0
    public com.esotericsoftware.spine.h m() {
        return this.f64362e;
    }

    public com.badlogic.gdx.utils.a<d> n() {
        return this.f64363f;
    }

    public float o() {
        return this.f64376s;
    }

    @d0
    public String p() {
        return this.f64375r;
    }

    public float q() {
        return this.f64372o;
    }

    public com.badlogic.gdx.utils.a<e> r() {
        return this.f64365h;
    }

    @d0
    public String s() {
        return this.f64377t;
    }

    @d0
    public String t() {
        return this.f64358a;
    }

    public String toString() {
        String str = this.f64358a;
        return str != null ? str : super.toString();
    }

    public com.badlogic.gdx.utils.a<PathConstraintData> u() {
        return this.f64367j;
    }

    public com.badlogic.gdx.utils.a<f> v() {
        return this.f64368k;
    }

    public float w() {
        return this.f64373p;
    }

    public com.badlogic.gdx.utils.a<com.esotericsoftware.spine.h> x() {
        return this.f64361d;
    }

    public com.badlogic.gdx.utils.a<n> y() {
        return this.f64360c;
    }

    public com.badlogic.gdx.utils.a<o> z() {
        return this.f64366i;
    }
}
