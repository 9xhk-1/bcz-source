package com.mob.tools.utils;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.mob.commons.i;
import com.mob.commons.r;
import com.mob.commons.t;
import com.mob.tools.MobHandlerThread;
import com.mob.tools.MobLog;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class SharePrefrenceHelper implements PublicMemberKeeper {

    /* renamed from: a, reason: collision with root package name */
    private Context f41415a;

    /* renamed from: b, reason: collision with root package name */
    private volatile a f41416b;

    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        private static Handler f41417c;

        /* renamed from: a, reason: collision with root package name */
        private File f41418a;

        /* renamed from: b, reason: collision with root package name */
        private HashMap<String, Object> f41419b = new HashMap<>();

        static {
            String str;
            if (TextUtils.isEmpty("M-")) {
                str = null;
            } else {
                str = t.f40412a + i.a("002Agjii");
            }
            f41417c = MobHandlerThread.newHandler(str, new Handler.Callback() { // from class: com.mob.tools.utils.SharePrefrenceHelper.a.1
                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                    try {
                        Bundle data = message.getData();
                        String string = data.getString(i.a("004Djhhigefm"));
                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(data.getString(i.a("004Ahjfggf%k"))), "utf-8");
                        outputStreamWriter.append((CharSequence) string);
                        outputStreamWriter.flush();
                        outputStreamWriter.close();
                        return false;
                    } catch (Throwable th2) {
                        MobLog.getInstance().w(th2);
                        return false;
                    }
                }
            });
        }

        public a(Context context, String str) {
            if (context != null) {
                try {
                    File file = new File(new File(context.getFilesDir(), i.a("003_ijgehe")), str);
                    this.f41418a = file;
                    if (!file.getParentFile().exists()) {
                        this.f41418a.getParentFile().mkdirs();
                    }
                    if (!this.f41418a.exists()) {
                        this.f41418a.createNewFile();
                    }
                } catch (Throwable th2) {
                    MobLog.getInstance().d(th2);
                    return;
                }
            }
            c();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object b(String str) {
            Object obj;
            synchronized (this.f41419b) {
                obj = this.f41419b.get(str);
            }
            return obj;
        }

        private void c() {
            BufferedReader bufferedReader;
            Throwable th2;
            synchronized (this.f41419b) {
                File file = this.f41418a;
                if (file != null && file.exists()) {
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(this.f41418a), "utf-8"));
                    } catch (Throwable th3) {
                        bufferedReader = null;
                        th2 = th3;
                    }
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                            if (sb2.length() > 0) {
                                sb2.append("\n");
                            }
                            sb2.append(readLine);
                        }
                        this.f41419b = HashonHelper.fromJson(sb2.toString());
                        r.a(bufferedReader);
                    } catch (Throwable th4) {
                        th2 = th4;
                        try {
                            MobLog.getInstance().w(th2);
                            r.a(bufferedReader);
                        } catch (Throwable th5) {
                            r.a(bufferedReader);
                            throw th5;
                        }
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, Object obj) {
            synchronized (this.f41419b) {
                try {
                    this.f41419b.put(str, obj);
                    if (f41417c != null && this.f41418a != null) {
                        Message message = new Message();
                        Bundle bundle = new Bundle();
                        bundle.putString(i.a("004Ujhhigefm"), HashonHelper.fromHashMap(this.f41419b));
                        bundle.putString(i.a("004+hjfggf%k"), this.f41418a.getAbsolutePath());
                        message.setData(bundle);
                        message.what = 1;
                        f41417c.sendMessage(message);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void b(String str, int i11) {
            a(str, Integer.valueOf(i11));
        }

        public void b(String str, long j11) {
            a(str, Long.valueOf(j11));
        }

        public void b(String str, boolean z11) {
            a(str, z11 ? (byte) 1 : (byte) 0);
        }

        public void b(String str, String str2) {
            a(str, (Object) str2);
        }

        public void b() {
            synchronized (this.f41419b) {
                this.f41419b.clear();
            }
            if (f41417c == null || this.f41418a == null) {
                return;
            }
            Message message = new Message();
            Bundle bundle = new Bundle();
            bundle.putString(i.a("004Jjhhigefm"), HashonHelper.fromHashMap(this.f41419b));
            bundle.putString(i.a("004MhjfggfHk"), this.f41418a.getAbsolutePath());
            message.setData(bundle);
            message.what = 1;
            f41417c.sendMessage(message);
        }

        public void a(String str, byte b11) {
            a(str, Byte.valueOf(b11));
        }

        public int a(String str, int i11) {
            Object b11 = b(str);
            return b11 != null ? ((Number) b11).intValue() : i11;
        }

        public long a(String str, long j11) {
            Object b11 = b(str);
            return b11 != null ? ((Number) b11).longValue() : j11;
        }

        public boolean a(String str, boolean z11) {
            Object b11 = b(str);
            return b11 != null ? ((Number) b11).byteValue() == 1 : z11;
        }

        public String a(String str, String str2) {
            Object b11 = b(str);
            return b11 != null ? (String) b11 : str2;
        }

        public HashMap<String, Object> a() {
            HashMap<String, Object> hashMap;
            synchronized (this.f41419b) {
                hashMap = new HashMap<>();
                hashMap.putAll(this.f41419b);
            }
            return hashMap;
        }

        public void a(HashMap<String, Object> hashMap) {
            synchronized (this.f41419b) {
                this.f41419b.putAll(hashMap);
            }
            if (f41417c == null || this.f41418a == null) {
                return;
            }
            Message message = new Message();
            Bundle bundle = new Bundle();
            bundle.putString(i.a("004_jhhigefm"), HashonHelper.fromHashMap(this.f41419b));
            bundle.putString(i.a("0046hjfggf?k"), this.f41418a.getAbsolutePath());
            message.setData(bundle);
            message.what = 1;
            f41417c.sendMessage(message);
        }

        public void a(String str) {
            a(str, (Object) null);
        }
    }

    public SharePrefrenceHelper(Context context) {
        if (context != null) {
            this.f41415a = context.getApplicationContext();
        }
    }

    public void clear() {
        if (this.f41416b != null) {
            this.f41416b.b();
        }
    }

    public Object get(String str) {
        ObjectInputStream objectInputStream;
        try {
            String string = getString(str);
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            try {
                objectInputStream = new ObjectInputStream(new ByteArrayInputStream(Base64.decode(string, 2)));
            } catch (Throwable th2) {
                th = th2;
                objectInputStream = null;
            }
            try {
                Object readObject = objectInputStream.readObject();
                objectInputStream.close();
                r.a(objectInputStream);
                return readObject;
            } catch (Throwable th3) {
                th = th3;
                r.a(objectInputStream);
                throw th;
            }
        } catch (Throwable th4) {
            MobLog.getInstance().w(th4);
            return null;
        }
    }

    public HashMap<String, Object> getAll() {
        return this.f41416b != null ? this.f41416b.a() : new HashMap<>();
    }

    public boolean getBoolean(String str) {
        if (this.f41416b != null) {
            return this.f41416b.a(str, false);
        }
        return false;
    }

    public int getInt(String str) {
        if (this.f41416b != null) {
            return this.f41416b.a(str, 0);
        }
        return 0;
    }

    public long getLong(String str) {
        return getLong(str, 0L);
    }

    public Object getObj(String str, Object obj) {
        return this.f41416b != null ? this.f41416b.b(str) : obj;
    }

    public String getString(String str) {
        return this.f41416b != null ? this.f41416b.a(str, "") : "";
    }

    public void open(String str) {
        open(str, 0);
    }

    public void put(String str, Object obj) {
        if (obj == null) {
            return;
        }
        ObjectOutputStream objectOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream2.writeObject(obj);
                objectOutputStream2.flush();
                putString(str, Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
                r.a(objectOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream = objectOutputStream2;
                try {
                    MobLog.getInstance().w(th);
                    r.a(objectOutputStream);
                } catch (Throwable th3) {
                    r.a(objectOutputStream);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public void putAll(HashMap<String, Object> hashMap) {
        if (this.f41416b != null) {
            this.f41416b.a(hashMap);
        }
    }

    public void putBoolean(String str, Boolean bool) {
        if (this.f41416b != null) {
            this.f41416b.b(str, bool.booleanValue());
        }
    }

    public void putInt(String str, Integer num) {
        if (this.f41416b != null) {
            this.f41416b.b(str, num.intValue());
        }
    }

    public void putLong(String str, Long l11) {
        if (this.f41416b != null) {
            this.f41416b.b(str, l11.longValue());
        }
    }

    public void putObj(String str, Object obj) {
        if (obj == null && this.f41416b != null) {
            this.f41416b.a(str);
        } else if (this.f41416b != null) {
            this.f41416b.a(str, obj);
        }
    }

    public void putString(String str, String str2) {
        if (this.f41416b != null) {
            this.f41416b.b(str, str2);
        }
    }

    public void remove(String str) {
        if (this.f41416b != null) {
            this.f41416b.a(str);
        }
    }

    public long getLong(String str, long j11) {
        return this.f41416b != null ? this.f41416b.a(str, j11) : j11;
    }

    public void open(String str, int i11) {
        this.f41416b = new a(this.f41415a, str + "_" + i11);
    }

    public boolean getBoolean(String str, boolean z11) {
        return this.f41416b != null ? this.f41416b.a(str, z11) : z11;
    }

    public int getInt(String str, int i11) {
        return this.f41416b != null ? this.f41416b.a(str, i11) : i11;
    }

    public String getString(String str, String str2) {
        return this.f41416b != null ? this.f41416b.a(str, str2) : str2;
    }
}
