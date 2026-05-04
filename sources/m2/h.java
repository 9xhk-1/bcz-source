package m2;

import com.badlogic.gdx.math.Vector3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class h extends b {
    public static void d(l2.k kVar, com.badlogic.gdx.graphics.a aVar) {
        e(kVar, aVar, b.f71766a.F(1.0f, 0.66f, 0.0f, 1.0f), b.f71767b.F(1.0f, 0.0f, 0.0f, 1.0f), b.f71768c.F(0.0f, 0.66f, 1.0f, 1.0f), b.f71769d.F(1.0f, 1.0f, 1.0f, 1.0f), b.f71770e.F(0.2f, 0.2f, 0.2f, 1.0f));
    }

    public static void e(l2.k kVar, com.badlogic.gdx.graphics.a aVar, com.badlogic.gdx.graphics.b bVar, com.badlogic.gdx.graphics.b bVar2, com.badlogic.gdx.graphics.b bVar3, com.badlogic.gdx.graphics.b bVar4, com.badlogic.gdx.graphics.b bVar5) {
        com.badlogic.gdx.math.j jVar = aVar.f11519l;
        Vector3[] vector3Arr = jVar.f12610b;
        f(kVar, jVar, bVar, bVar5);
        kVar.O(vector3Arr[0], bVar2, aVar.f11508a, bVar2);
        kVar.O(vector3Arr[1], bVar2, aVar.f11508a, bVar2);
        kVar.O(vector3Arr[2], bVar2, aVar.f11508a, bVar2);
        kVar.O(vector3Arr[3], bVar2, aVar.f11508a, bVar2);
        kVar.O(aVar.f11508a, bVar4, g(vector3Arr[4], vector3Arr[5], vector3Arr[6]), bVar4);
        Vector3 vector3 = b.f71771f;
        float len = vector3.set(vector3Arr[1]).sub(vector3Arr[0]).scl(0.5f).len();
        Vector3 g11 = g(vector3Arr[0], vector3Arr[1], vector3Arr[2]);
        vector3.set(aVar.f11510c).scl(len * 2.0f);
        g11.add(vector3);
        kVar.O(g11, bVar3, vector3Arr[2], bVar3);
        kVar.O(vector3Arr[2], bVar3, vector3Arr[3], bVar3);
        kVar.O(vector3Arr[3], bVar3, g11, bVar3);
    }

    public static void f(l2.k kVar, com.badlogic.gdx.math.j jVar, com.badlogic.gdx.graphics.b bVar, com.badlogic.gdx.graphics.b bVar2) {
        Vector3[] vector3Arr = jVar.f12610b;
        kVar.O(vector3Arr[0], bVar, vector3Arr[1], bVar);
        kVar.O(vector3Arr[1], bVar, vector3Arr[2], bVar);
        kVar.O(vector3Arr[2], bVar, vector3Arr[3], bVar);
        kVar.O(vector3Arr[3], bVar, vector3Arr[0], bVar);
        kVar.O(vector3Arr[4], bVar, vector3Arr[5], bVar);
        kVar.O(vector3Arr[5], bVar, vector3Arr[6], bVar);
        kVar.O(vector3Arr[6], bVar, vector3Arr[7], bVar);
        kVar.O(vector3Arr[7], bVar, vector3Arr[4], bVar);
        kVar.O(vector3Arr[0], bVar, vector3Arr[4], bVar);
        kVar.O(vector3Arr[1], bVar, vector3Arr[5], bVar);
        kVar.O(vector3Arr[2], bVar, vector3Arr[6], bVar);
        kVar.O(vector3Arr[3], bVar, vector3Arr[7], bVar);
        kVar.O(h(vector3Arr[1], vector3Arr[0]), bVar2, h(vector3Arr[3], vector3Arr[2]), bVar2);
        kVar.O(h(vector3Arr[2], vector3Arr[1]), bVar2, h(vector3Arr[3], vector3Arr[0]), bVar2);
        kVar.O(h(vector3Arr[5], vector3Arr[4]), bVar2, h(vector3Arr[7], vector3Arr[6]), bVar2);
        kVar.O(h(vector3Arr[6], vector3Arr[5]), bVar2, h(vector3Arr[7], vector3Arr[4]), bVar2);
    }

    public static Vector3 g(Vector3 vector3, Vector3 vector32, Vector3 vector33) {
        Vector3 vector34 = b.f71771f;
        vector34.set(vector32).sub(vector3).scl(0.5f);
        Vector3 vector35 = b.f71772g;
        vector35.set(vector3).add(vector34);
        vector34.set(vector33).sub(vector32).scl(0.5f);
        return vector35.add(vector34);
    }

    public static Vector3 h(Vector3 vector3, Vector3 vector32) {
        Vector3 vector33 = b.f71771f;
        vector33.set(vector32).sub(vector3).scl(0.5f);
        return b.f71772g.set(vector3).add(vector33);
    }
}
