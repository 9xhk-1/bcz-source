package z2;

import a3.d0;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static com.badlogic.gdx.utils.a<Rectangle> f100726a = new com.badlogic.gdx.utils.a<>();

    /* renamed from: b, reason: collision with root package name */
    public static Vector3 f100727b = new Vector3();

    /* renamed from: c, reason: collision with root package name */
    public static final Rectangle f100728c = new Rectangle();

    public static void a(com.badlogic.gdx.graphics.a aVar, float f11, float f12, float f13, float f14, Matrix4 matrix4, Rectangle rectangle, Rectangle rectangle2) {
        f100727b.set(rectangle.f12533x, rectangle.f12534y, 0.0f);
        f100727b.mul(matrix4);
        aVar.g(f100727b, f11, f12, f13, f14);
        Vector3 vector3 = f100727b;
        rectangle2.f12533x = vector3.f12537x;
        rectangle2.f12534y = vector3.f12538y;
        vector3.set(rectangle.f12533x + rectangle.width, rectangle.f12534y + rectangle.height, 0.0f);
        f100727b.mul(matrix4);
        aVar.g(f100727b, f11, f12, f13, f14);
        Vector3 vector32 = f100727b;
        rectangle2.width = vector32.f12537x - rectangle2.f12533x;
        rectangle2.height = vector32.f12538y - rectangle2.f12534y;
    }

    public static void b(com.badlogic.gdx.graphics.a aVar, Matrix4 matrix4, Rectangle rectangle, Rectangle rectangle2) {
        a(aVar, 0.0f, 0.0f, q1.g.f81379b.getWidth(), q1.g.f81379b.getHeight(), matrix4, rectangle, rectangle2);
    }

    public static void c(Rectangle rectangle) {
        rectangle.f12533x = Math.round(rectangle.f12533x);
        rectangle.f12534y = Math.round(rectangle.f12534y);
        rectangle.width = Math.round(rectangle.width);
        float round = Math.round(rectangle.height);
        rectangle.height = round;
        float f11 = rectangle.width;
        if (f11 < 0.0f) {
            float f12 = -f11;
            rectangle.width = f12;
            rectangle.f12533x -= f12;
        }
        if (round < 0.0f) {
            float f13 = -round;
            rectangle.height = f13;
            rectangle.f12534y -= f13;
        }
    }

    public static Rectangle d() {
        com.badlogic.gdx.utils.a<Rectangle> aVar = f100726a;
        if (aVar.f13179b == 0) {
            Rectangle rectangle = f100728c;
            rectangle.set(0.0f, 0.0f, q1.g.f81379b.getWidth(), q1.g.f81379b.getHeight());
            return rectangle;
        }
        Rectangle peek = aVar.peek();
        Rectangle rectangle2 = f100728c;
        rectangle2.set(peek);
        return rectangle2;
    }

    @d0
    public static Rectangle e() {
        com.badlogic.gdx.utils.a<Rectangle> aVar = f100726a;
        if (aVar.f13179b == 0) {
            return null;
        }
        return aVar.peek();
    }

    public static Rectangle f() {
        Rectangle pop = f100726a.pop();
        com.badlogic.gdx.utils.a<Rectangle> aVar = f100726a;
        if (aVar.f13179b == 0) {
            q1.g.f81384g.glDisable(com.badlogic.gdx.graphics.f.f11588g0);
            return pop;
        }
        Rectangle peek = aVar.peek();
        n2.j.a((int) peek.f12533x, (int) peek.f12534y, (int) peek.width, (int) peek.height);
        return pop;
    }

    public static boolean g(Rectangle rectangle) {
        c(rectangle);
        com.badlogic.gdx.utils.a<Rectangle> aVar = f100726a;
        int i11 = aVar.f13179b;
        if (i11 != 0) {
            Rectangle rectangle2 = aVar.get(i11 - 1);
            float max = Math.max(rectangle2.f12533x, rectangle.f12533x);
            float min = Math.min(rectangle2.f12533x + rectangle2.width, rectangle.f12533x + rectangle.width) - max;
            if (min < 1.0f) {
                return false;
            }
            float max2 = Math.max(rectangle2.f12534y, rectangle.f12534y);
            float min2 = Math.min(rectangle2.f12534y + rectangle2.height, rectangle.f12534y + rectangle.height) - max2;
            if (min2 < 1.0f) {
                return false;
            }
            rectangle.f12533x = max;
            rectangle.f12534y = max2;
            rectangle.width = min;
            rectangle.height = Math.max(1.0f, min2);
        } else {
            if (rectangle.width < 1.0f || rectangle.height < 1.0f) {
                return false;
            }
            q1.g.f81384g.glEnable(com.badlogic.gdx.graphics.f.f11588g0);
        }
        f100726a.a(rectangle);
        n2.j.a((int) rectangle.f12533x, (int) rectangle.f12534y, (int) rectangle.width, (int) rectangle.height);
        return true;
    }
}
