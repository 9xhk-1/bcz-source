package androidx.constraintlayout.motion.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.load.engine.GlideException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.CharBuffer;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"LogConditional"})
/* loaded from: classes2.dex */
public class Debug {
    public static void dumpLayoutParams(ViewGroup viewGroup, String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + str + GlideException.a.f28776d;
        int childCount = viewGroup.getChildCount();
        System.out.println(str + " children " + childCount);
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            System.out.println(str2 + "     " + getName(childAt));
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Field[] fields = layoutParams.getClass().getFields();
            for (int i12 = 0; i12 < fields.length; i12++) {
                Field field = fields[i12];
                try {
                    Object obj = field.get(layoutParams);
                    if (field.getName().contains("To") && !obj.toString().equals("-1")) {
                        System.out.println(str2 + "       " + field.getName() + " " + obj);
                    }
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    public static void dumpPoc(Object obj) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + j.f81007d;
        Class<?> cls = obj.getClass();
        System.out.println(str + "------------- " + cls.getName() + " --------------------");
        for (Field field : cls.getFields()) {
            try {
                Object obj2 = field.get(obj);
                if (field.getName().startsWith("layout_constraint") && ((!(obj2 instanceof Integer) || !obj2.toString().equals("-1")) && ((!(obj2 instanceof Integer) || !obj2.toString().equals("0")) && ((!(obj2 instanceof Float) || !obj2.toString().equals("1.0")) && (!(obj2 instanceof Float) || !obj2.toString().equals("0.5")))))) {
                    System.out.println(str + "    " + field.getName() + " " + obj2);
                }
            } catch (IllegalAccessException unused) {
            }
        }
        System.out.println(str + "------------- " + cls.getSimpleName() + " --------------------");
    }

    public static String getActionType(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        for (Field field : MotionEvent.class.getFields()) {
            try {
                if (Modifier.isStatic(field.getModifiers()) && field.getType().equals(Integer.TYPE) && field.getInt(null) == action) {
                    return field.getName();
                }
            } catch (IllegalAccessException unused) {
            }
        }
        return "---";
    }

    public static String getCallFrom(int i11) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[i11 + 2];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + j.f81007d;
    }

    public static String getLoc() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    public static String getLocation() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + j.f81007d;
    }

    public static String getLocation2() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + j.f81007d;
    }

    public static String getName(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static String getState(MotionLayout motionLayout, int i11) {
        return getState(motionLayout, i11, -1);
    }

    public static void logStack(String str, String str2, int i11) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i11, stackTrace.length - 1);
        String str3 = " ";
        for (int i12 = 1; i12 <= min; i12++) {
            StackTraceElement stackTraceElement = stackTrace[i12];
            str3 = str3 + " ";
            Log.v(str, str2 + str3 + (".(" + stackTrace[i12].getFileName() + ":" + stackTrace[i12].getLineNumber() + ") " + stackTrace[i12].getMethodName()) + str3);
        }
    }

    public static void printStack(String str, int i11) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i11, stackTrace.length - 1);
        String str2 = " ";
        for (int i12 = 1; i12 <= min; i12++) {
            StackTraceElement stackTraceElement = stackTrace[i12];
            String str3 = ".(" + stackTrace[i12].getFileName() + ":" + stackTrace[i12].getLineNumber() + ") ";
            str2 = str2 + " ";
            System.out.println(str + str2 + str3 + str2);
        }
    }

    public static String getState(MotionLayout motionLayout, int i11, int i12) {
        int length;
        if (i11 == -1) {
            return "UNDEFINED";
        }
        String resourceEntryName = motionLayout.getContext().getResources().getResourceEntryName(i11);
        if (i12 == -1) {
            return resourceEntryName;
        }
        if (resourceEntryName.length() > i12) {
            resourceEntryName = resourceEntryName.replaceAll("([^_])[aeiou]+", "$1");
        }
        if (resourceEntryName.length() <= i12 || (length = resourceEntryName.replaceAll("[^_]", "").length()) <= 0) {
            return resourceEntryName;
        }
        return resourceEntryName.replaceAll(CharBuffer.allocate((resourceEntryName.length() - i12) / length).toString().replace((char) 0, '.') + "_", "_");
    }

    public static String getName(Context context, int i11) {
        if (i11 != -1) {
            try {
                return context.getResources().getResourceEntryName(i11);
            } catch (Exception unused) {
                return "?" + i11;
            }
        }
        return "UNKNOWN";
    }

    public static String getName(Context context, int[] iArr) {
        String str;
        try {
            String str2 = iArr.length + "[";
            int i11 = 0;
            while (i11 < iArr.length) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(i11 == 0 ? "" : " ");
                String sb3 = sb2.toString();
                try {
                    str = context.getResources().getResourceEntryName(iArr[i11]);
                } catch (Resources.NotFoundException unused) {
                    str = "? " + iArr[i11] + " ";
                }
                str2 = sb3 + str;
                i11++;
            }
            return str2 + "]";
        } catch (Exception e11) {
            Log.v("DEBUG", e11.toString());
            return "UNKNOWN";
        }
    }

    public static void dumpLayoutParams(ViewGroup.LayoutParams layoutParams, String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + str + GlideException.a.f28776d;
        System.out.println(" >>>>>>>>>>>>>>>>>>. dump " + str2 + GlideException.a.f28776d + layoutParams.getClass().getName());
        for (Field field : layoutParams.getClass().getFields()) {
            try {
                Object obj = field.get(layoutParams);
                String name = field.getName();
                if (name.contains("To") && !obj.toString().equals("-1")) {
                    System.out.println(str2 + "       " + name + " " + obj);
                }
            } catch (IllegalAccessException unused) {
            }
        }
        System.out.println(" <<<<<<<<<<<<<<<<< dump " + str2);
    }
}
