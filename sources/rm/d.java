package rm;

import android.content.res.AssetManager;
import android.os.Environment;
import android.util.Log;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f84259a = "MPChart-FileUtils";

    public static List<BarEntry> a(AssetManager assetManager, String str) {
        BufferedReader bufferedReader;
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader2 = null;
        try {
            try {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(assetManager.open(str), "UTF-8"));
                } catch (IOException e11) {
                    Log.e(f84259a, e11.toString());
                    return arrayList;
                }
            } catch (IOException e12) {
                e = e12;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                String[] split = readLine.split("#");
                arrayList.add(new BarEntry(Float.parseFloat(split[1]), Float.parseFloat(split[0])));
            }
            bufferedReader.close();
            return arrayList;
        } catch (IOException e13) {
            e = e13;
            bufferedReader2 = bufferedReader;
            Log.e(f84259a, e.toString());
            if (bufferedReader2 != null) {
                bufferedReader2.close();
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException e14) {
                    Log.e(f84259a, e14.toString());
                }
            }
            throw th;
        }
    }

    public static List<Entry> b(AssetManager assetManager, String str) {
        BufferedReader bufferedReader;
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader2 = null;
        try {
            try {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(assetManager.open(str), "UTF-8"));
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e11) {
                e = e11;
            }
        } catch (IOException e12) {
            Log.e(f84259a, e12.toString());
        }
        try {
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                String[] split = readLine.split("#");
                if (split.length <= 2) {
                    arrayList.add(new Entry(Float.parseFloat(split[1]), Float.parseFloat(split[0])));
                } else {
                    int length = split.length - 1;
                    float[] fArr = new float[length];
                    for (int i11 = 0; i11 < length; i11++) {
                        fArr[i11] = Float.parseFloat(split[i11]);
                    }
                    arrayList.add(new BarEntry(Integer.parseInt(split[split.length - 1]), fArr));
                }
            }
            bufferedReader.close();
            return arrayList;
        } catch (IOException e13) {
            e = e13;
            bufferedReader2 = bufferedReader;
            Log.e(f84259a, e.toString());
            if (bufferedReader2 != null) {
                bufferedReader2.close();
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException e14) {
                    Log.e(f84259a, e14.toString());
                }
            }
            throw th;
        }
    }

    public static List<Entry> c(String str) {
        File file = new File(Environment.getExternalStorageDirectory(), str);
        ArrayList arrayList = new ArrayList();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return arrayList;
                }
                String[] split = readLine.split("#");
                if (split.length <= 2) {
                    arrayList.add(new Entry(Float.parseFloat(split[0]), Integer.parseInt(split[1])));
                } else {
                    int length = split.length - 1;
                    float[] fArr = new float[length];
                    for (int i11 = 0; i11 < length; i11++) {
                        fArr[i11] = Float.parseFloat(split[i11]);
                    }
                    arrayList.add(new BarEntry(Integer.parseInt(split[split.length - 1]), fArr));
                }
            }
        } catch (IOException e11) {
            Log.e(f84259a, e11.toString());
            return arrayList;
        }
    }

    public static void d(List<Entry> list, String str) {
        File file = new File(Environment.getExternalStorageDirectory(), str);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e11) {
                Log.e(f84259a, e11.toString());
            }
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            for (Entry entry : list) {
                bufferedWriter.append((CharSequence) (entry.c() + "#" + entry.j()));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e12) {
            Log.e(f84259a, e12.toString());
        }
    }
}
