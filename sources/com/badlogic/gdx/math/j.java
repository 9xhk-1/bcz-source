package com.badlogic.gdx.math;

import com.badlogic.gdx.math.Plane;
import com.badlogic.gdx.math.collision.BoundingBox;
import com.badlogic.gdx.math.collision.OrientedBoundingBox;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class j {

    /* renamed from: d, reason: collision with root package name */
    public static final Vector3[] f12606d;

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f12607e;

    /* renamed from: f, reason: collision with root package name */
    public static final Vector3 f12608f;

    /* renamed from: a, reason: collision with root package name */
    public final Plane[] f12609a = new Plane[6];

    /* renamed from: b, reason: collision with root package name */
    public final Vector3[] f12610b = {new Vector3(), new Vector3(), new Vector3(), new Vector3(), new Vector3(), new Vector3(), new Vector3(), new Vector3()};

    /* renamed from: c, reason: collision with root package name */
    public final float[] f12611c = new float[24];

    static {
        Vector3[] vector3Arr = {new Vector3(-1.0f, -1.0f, -1.0f), new Vector3(1.0f, -1.0f, -1.0f), new Vector3(1.0f, 1.0f, -1.0f), new Vector3(-1.0f, 1.0f, -1.0f), new Vector3(-1.0f, -1.0f, 1.0f), new Vector3(1.0f, -1.0f, 1.0f), new Vector3(1.0f, 1.0f, 1.0f), new Vector3(-1.0f, 1.0f, 1.0f)};
        f12606d = vector3Arr;
        f12607e = new float[24];
        int i11 = 0;
        for (Vector3 vector3 : vector3Arr) {
            float[] fArr = f12607e;
            fArr[i11] = vector3.f12537x;
            int i12 = i11 + 2;
            fArr[i11 + 1] = vector3.f12538y;
            i11 += 3;
            fArr[i12] = vector3.f12539z;
        }
        f12608f = new Vector3();
    }

    public j() {
        for (int i11 = 0; i11 < 6; i11++) {
            this.f12609a[i11] = new Plane(new Vector3(), 0.0f);
        }
    }

    public boolean a(float f11, float f12, float f13, float f14, float f15, float f16) {
        int length = this.f12609a.length;
        for (int i11 = 0; i11 < length; i11++) {
            float f17 = f11 + f14;
            float f18 = f12 + f15;
            float f19 = f13 + f16;
            Plane.PlaneSide testPoint = this.f12609a[i11].testPoint(f17, f18, f19);
            Plane.PlaneSide planeSide = Plane.PlaneSide.Back;
            if (testPoint == planeSide) {
                float f21 = f13 - f16;
                if (this.f12609a[i11].testPoint(f17, f18, f21) != planeSide) {
                    continue;
                } else {
                    float f22 = f12 - f15;
                    if (this.f12609a[i11].testPoint(f17, f22, f19) == planeSide && this.f12609a[i11].testPoint(f17, f22, f21) == planeSide) {
                        float f23 = f11 - f14;
                        if (this.f12609a[i11].testPoint(f23, f18, f19) == planeSide && this.f12609a[i11].testPoint(f23, f18, f21) == planeSide && this.f12609a[i11].testPoint(f23, f22, f19) == planeSide && this.f12609a[i11].testPoint(f23, f22, f21) == planeSide) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public boolean b(Vector3 vector3, Vector3 vector32) {
        return a(vector3.f12537x, vector3.f12538y, vector3.f12539z, vector32.f12537x / 2.0f, vector32.f12538y / 2.0f, vector32.f12539z / 2.0f);
    }

    public boolean c(BoundingBox boundingBox) {
        int length = this.f12609a.length;
        for (int i11 = 0; i11 < length; i11++) {
            Plane plane = this.f12609a[i11];
            Vector3 vector3 = f12608f;
            Plane.PlaneSide testPoint = plane.testPoint(boundingBox.getCorner000(vector3));
            Plane.PlaneSide planeSide = Plane.PlaneSide.Back;
            if (testPoint == planeSide && this.f12609a[i11].testPoint(boundingBox.getCorner001(vector3)) == planeSide && this.f12609a[i11].testPoint(boundingBox.getCorner010(vector3)) == planeSide && this.f12609a[i11].testPoint(boundingBox.getCorner011(vector3)) == planeSide && this.f12609a[i11].testPoint(boundingBox.getCorner100(vector3)) == planeSide && this.f12609a[i11].testPoint(boundingBox.getCorner101(vector3)) == planeSide && this.f12609a[i11].testPoint(boundingBox.getCorner110(vector3)) == planeSide && this.f12609a[i11].testPoint(boundingBox.getCorner111(vector3)) == planeSide) {
                return false;
            }
        }
        return true;
    }

    public boolean d(OrientedBoundingBox orientedBoundingBox) {
        int length = this.f12609a.length;
        for (int i11 = 0; i11 < length; i11++) {
            Plane plane = this.f12609a[i11];
            Vector3 vector3 = f12608f;
            Plane.PlaneSide testPoint = plane.testPoint(orientedBoundingBox.getCorner000(vector3));
            Plane.PlaneSide planeSide = Plane.PlaneSide.Back;
            if (testPoint == planeSide && this.f12609a[i11].testPoint(orientedBoundingBox.getCorner001(vector3)) == planeSide && this.f12609a[i11].testPoint(orientedBoundingBox.getCorner010(vector3)) == planeSide && this.f12609a[i11].testPoint(orientedBoundingBox.getCorner011(vector3)) == planeSide && this.f12609a[i11].testPoint(orientedBoundingBox.getCorner100(vector3)) == planeSide && this.f12609a[i11].testPoint(orientedBoundingBox.getCorner101(vector3)) == planeSide && this.f12609a[i11].testPoint(orientedBoundingBox.getCorner110(vector3)) == planeSide && this.f12609a[i11].testPoint(orientedBoundingBox.getCorner111(vector3)) == planeSide) {
                return false;
            }
        }
        return true;
    }

    public boolean e(float f11, float f12, float f13) {
        int i11 = 0;
        while (true) {
            Plane[] planeArr = this.f12609a;
            if (i11 >= planeArr.length) {
                return true;
            }
            if (planeArr[i11].testPoint(f11, f12, f13) == Plane.PlaneSide.Back) {
                return false;
            }
            i11++;
        }
    }

    public boolean f(Vector3 vector3) {
        int i11 = 0;
        while (true) {
            Plane[] planeArr = this.f12609a;
            if (i11 >= planeArr.length) {
                return true;
            }
            if (planeArr[i11].testPoint(vector3) == Plane.PlaneSide.Back) {
                return false;
            }
            i11++;
        }
    }

    public boolean g(float f11, float f12, float f13, float f14) {
        for (int i11 = 0; i11 < 6; i11++) {
            Plane plane = this.f12609a[i11];
            Vector3 vector3 = plane.normal;
            if ((vector3.f12537x * f11) + (vector3.f12538y * f12) + (vector3.f12539z * f13) < (-f14) - plane.f12528d) {
                return false;
            }
        }
        return true;
    }

    public boolean h(Vector3 vector3, float f11) {
        for (int i11 = 0; i11 < 6; i11++) {
            Plane plane = this.f12609a[i11];
            Vector3 vector32 = plane.normal;
            if ((vector32.f12537x * vector3.f12537x) + (vector32.f12538y * vector3.f12538y) + (vector32.f12539z * vector3.f12539z) < (-f11) - plane.f12528d) {
                return false;
            }
        }
        return true;
    }

    public boolean i(float f11, float f12, float f13, float f14) {
        for (int i11 = 2; i11 < 6; i11++) {
            Plane plane = this.f12609a[i11];
            Vector3 vector3 = plane.normal;
            if ((vector3.f12537x * f11) + (vector3.f12538y * f12) + (vector3.f12539z * f13) < (-f14) - plane.f12528d) {
                return false;
            }
        }
        return true;
    }

    public boolean j(Vector3 vector3, float f11) {
        for (int i11 = 2; i11 < 6; i11++) {
            Plane plane = this.f12609a[i11];
            Vector3 vector32 = plane.normal;
            if ((vector32.f12537x * vector3.f12537x) + (vector32.f12538y * vector3.f12538y) + (vector32.f12539z * vector3.f12539z) < (-f11) - plane.f12528d) {
                return false;
            }
        }
        return true;
    }

    public void k(Matrix4 matrix4) {
        float[] fArr = f12607e;
        System.arraycopy(fArr, 0, this.f12611c, 0, fArr.length);
        Matrix4.prj(matrix4.val, this.f12611c, 0, 8, 3);
        int i11 = 0;
        for (int i12 = 0; i12 < 8; i12++) {
            Vector3 vector3 = this.f12610b[i12];
            float[] fArr2 = this.f12611c;
            vector3.f12537x = fArr2[i11];
            int i13 = i11 + 2;
            vector3.f12538y = fArr2[i11 + 1];
            i11 += 3;
            vector3.f12539z = fArr2[i13];
        }
        Plane plane = this.f12609a[0];
        Vector3[] vector3Arr = this.f12610b;
        plane.set(vector3Arr[1], vector3Arr[0], vector3Arr[2]);
        Plane plane2 = this.f12609a[1];
        Vector3[] vector3Arr2 = this.f12610b;
        plane2.set(vector3Arr2[4], vector3Arr2[5], vector3Arr2[7]);
        Plane plane3 = this.f12609a[2];
        Vector3[] vector3Arr3 = this.f12610b;
        plane3.set(vector3Arr3[0], vector3Arr3[4], vector3Arr3[3]);
        Plane plane4 = this.f12609a[3];
        Vector3[] vector3Arr4 = this.f12610b;
        plane4.set(vector3Arr4[5], vector3Arr4[1], vector3Arr4[6]);
        Plane plane5 = this.f12609a[4];
        Vector3[] vector3Arr5 = this.f12610b;
        plane5.set(vector3Arr5[2], vector3Arr5[3], vector3Arr5[6]);
        Plane plane6 = this.f12609a[5];
        Vector3[] vector3Arr6 = this.f12610b;
        plane6.set(vector3Arr6[4], vector3Arr6[0], vector3Arr6[1]);
    }
}
