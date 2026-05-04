package com.meizu.cloud.pushsdk.d.f;

import android.content.Context;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f39829a = "a";

    public static Map a(String str, Context context) {
        try {
            String str2 = f39829a;
            c.b(str2, "Attempting to retrieve map from: %s", str);
            ObjectInputStream objectInputStream = new ObjectInputStream(context.openFileInput(str));
            HashMap hashMap = (HashMap) objectInputStream.readObject();
            objectInputStream.close();
            c.b(str2, " + Retrieved map from file: %s", hashMap);
            return hashMap;
        } catch (IOException | ClassNotFoundException e11) {
            c.a(f39829a, " + Exception getting vars map: %s", e11.getMessage());
            return null;
        }
    }

    public static boolean a(String str, Map map, Context context) {
        try {
            String str2 = f39829a;
            c.b(str2, "Attempting to save: %s", map);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(context.openFileOutput(str, 0));
            objectOutputStream.writeObject(map);
            objectOutputStream.close();
            c.b(str2, " + Successfully saved KV Pairs to: %s", str);
            return true;
        } catch (IOException e11) {
            c.a(f39829a, " + Exception saving vars map: %s", e11.getMessage());
            return false;
        }
    }
}
