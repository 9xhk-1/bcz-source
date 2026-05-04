package t;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.hardware.Camera;
import android.preference.PreferenceManager;
import android.view.Display;
import android.view.WindowManager;
import c40.t0;
import cn.hugo.android.scanner.camera.FrontLightMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final String f89068d = "CameraConfiguration";

    /* renamed from: e, reason: collision with root package name */
    public static final int f89069e = 153600;

    /* renamed from: f, reason: collision with root package name */
    public static final double f89070f = 0.15d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f89071a;

    /* renamed from: b, reason: collision with root package name */
    public Point f89072b;

    /* renamed from: c, reason: collision with root package name */
    public Point f89073c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Comparator<Camera.Size> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Camera.Size a11, Camera.Size b11) {
            int i11 = a11.height * a11.width;
            int i12 = b11.height * b11.width;
            if (i12 < i11) {
                return -1;
            }
            return i12 > i11 ? 1 : 0;
        }
    }

    public c(Context context) {
        this.f89071a = context;
    }

    public static String c(Collection<String> supportedValues, String... desiredValues) {
        String str;
        qb.c.i(f89068d, "Supported values: " + supportedValues, new Object[0]);
        if (supportedValues != null) {
            int length = desiredValues.length;
            for (int i11 = 0; i11 < length; i11++) {
                str = desiredValues[i11];
                if (supportedValues.contains(str)) {
                    break;
                }
            }
        }
        str = null;
        qb.c.i(f89068d, "Settable value: " + str, new Object[0]);
        return str;
    }

    public final void a(Camera.Parameters parameters, boolean newSetting, boolean safeMode) {
        String c11 = newSetting ? c(parameters.getSupportedFlashModes(), "torch", t0.f7979d) : c(parameters.getSupportedFlashModes(), t0.f7980e);
        if (c11 != null) {
            parameters.setFlashMode(c11);
        }
    }

    public final Point b(Camera.Parameters parameters, Point screenResolution) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes == null) {
            qb.c.q(f89068d, "Device returned no supported preview sizes; using default", new Object[0]);
            Camera.Size previewSize = parameters.getPreviewSize();
            return new Point(previewSize.width, previewSize.height);
        }
        ArrayList<Camera.Size> arrayList = new ArrayList(supportedPreviewSizes);
        Collections.sort(arrayList, new a());
        StringBuilder sb2 = new StringBuilder();
        for (Camera.Size size : arrayList) {
            sb2.append(size.width);
            sb2.append('x');
            sb2.append(size.height);
            sb2.append(' ');
        }
        qb.c.i(f89068d, "Supported preview sizes: " + ((Object) sb2), new Object[0]);
        double d11 = ((double) screenResolution.x) / ((double) screenResolution.y);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Camera.Size size2 = (Camera.Size) it.next();
            int i11 = size2.width;
            int i12 = size2.height;
            if (i11 * i12 < 153600) {
                it.remove();
            } else {
                boolean z11 = i11 < i12;
                int i13 = z11 ? i12 : i11;
                int i14 = z11 ? i11 : i12;
                if (Math.abs((i13 / i14) - d11) > 0.15d) {
                    it.remove();
                } else if (i13 == screenResolution.x && i14 == screenResolution.y) {
                    Point point = new Point(i11, i12);
                    qb.c.i(f89068d, "Found preview size exactly matching screen size: " + point, new Object[0]);
                    return point;
                }
            }
        }
        if (arrayList.isEmpty()) {
            Camera.Size previewSize2 = parameters.getPreviewSize();
            Point point2 = new Point(previewSize2.width, previewSize2.height);
            qb.c.i(f89068d, "No suitable preview sizes, using default: " + point2, new Object[0]);
            return point2;
        }
        Camera.Size size3 = (Camera.Size) arrayList.get(0);
        Point point3 = new Point(size3.width, size3.height);
        qb.c.i(f89068d, "Using largest suitable preview size: " + point3, new Object[0]);
        return point3;
    }

    public Point d() {
        return this.f89073c;
    }

    @SuppressLint({"NewApi"})
    public final Point e(final Display display) {
        Point point = new Point();
        try {
            display.getSize(point);
            return point;
        } catch (NoSuchMethodError unused) {
            point.x = display.getWidth();
            point.y = display.getHeight();
            return point;
        }
    }

    public Point f() {
        return this.f89072b;
    }

    public boolean g(Camera camera) {
        String flashMode;
        return (camera == null || camera.getParameters() == null || (flashMode = camera.getParameters().getFlashMode()) == null || (!t0.f7979d.equals(flashMode) && !"torch".equals(flashMode))) ? false : true;
    }

    public void h(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        Display defaultDisplay = ((WindowManager) this.f89071a.getSystemService("window")).getDefaultDisplay();
        new Point();
        this.f89072b = e(defaultDisplay);
        qb.c.i(f89068d, "Screen resolution: " + this.f89072b, new Object[0]);
        Point point = new Point();
        Point point2 = this.f89072b;
        point.x = point2.x;
        point.y = point2.y;
        int i11 = point2.x;
        int i12 = point2.y;
        if (i11 < i12) {
            point.x = i12;
            point.y = point2.x;
        }
        this.f89073c = b(parameters, point);
        qb.c.i(f89068d, "Camera resolution: " + this.f89073c, new Object[0]);
    }

    public final void i(Camera.Parameters parameters, SharedPreferences prefs, boolean safeMode) {
        a(parameters, FrontLightMode.readPref(prefs) == FrontLightMode.ON, safeMode);
    }

    public void j(Camera camera, boolean safeMode) {
        String c11;
        Camera.Parameters parameters = camera.getParameters();
        if (parameters == null) {
            qb.c.q(f89068d, "Device error: no camera parameters are available. Proceeding without configuration.", new Object[0]);
            return;
        }
        qb.c.i(f89068d, "Initial camera parameters: " + parameters.flatten(), new Object[0]);
        if (safeMode) {
            qb.c.q(f89068d, "In camera config safe mode -- most settings will not be honored", new Object[0]);
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f89071a);
        i(parameters, defaultSharedPreferences, safeMode);
        String c12 = c(parameters.getSupportedFocusModes(), "auto");
        if (!safeMode && c12 == null) {
            c12 = c(parameters.getSupportedFocusModes(), "macro", "edof");
        }
        if (c12 != null) {
            parameters.setFocusMode(c12);
        }
        if (defaultSharedPreferences.getBoolean(v.a.f92798q, false) && (c11 = c(parameters.getSupportedColorEffects(), ma.b.T)) != null) {
            parameters.setColorEffect(c11);
        }
        Point point = this.f89073c;
        parameters.setPreviewSize(point.x, point.y);
        camera.setParameters(parameters);
        Camera.Size previewSize = camera.getParameters().getPreviewSize();
        if (previewSize != null) {
            Point point2 = this.f89073c;
            if (point2.x != previewSize.width || point2.y != previewSize.height) {
                qb.c.q(f89068d, "Camera said it supported preview size " + this.f89073c.x + 'x' + this.f89073c.y + ", but after setting it, preview size is " + previewSize.width + 'x' + previewSize.height, new Object[0]);
                Point point3 = this.f89073c;
                point3.x = previewSize.width;
                point3.y = previewSize.height;
            }
        }
        camera.setDisplayOrientation(90);
    }

    public void k(Camera camera, boolean newSetting) {
        Camera.Parameters parameters = camera.getParameters();
        a(parameters, newSetting, false);
        camera.setParameters(parameters);
    }
}
