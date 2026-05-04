package zc;

import com.baicizhan.learning_strategy.util.L;
import java.io.File;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.Scriptable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public String f102543a;

    public a(String str) {
        this.f102543a = str;
    }

    public final ad.a a(Context context, Scriptable scriptable) {
        Object b11 = com.baicizhan.learning_strategy.util.c.b(context, scriptable, "new LearningManager()");
        if (b11 instanceof NativeObject) {
            return new bd.a((NativeObject) b11);
        }
        return null;
    }

    public final void b(Set<File> set, File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                if (file.isFile()) {
                    set.add(file);
                    return;
                }
                return;
            }
            String[] list = file.list();
            if (list == null) {
                return;
            }
            for (String str : list) {
                b(set, new File(file, str));
            }
        }
    }

    public final boolean c(Context context, Scriptable scriptable, Set<File> set) {
        Context context2;
        Scriptable scriptable2;
        HashSet hashSet = new HashSet();
        for (int size = set.size() + 1; size > 0 && hashSet.size() != set.size(); size--) {
            for (File file : set) {
                if (!hashSet.contains(file)) {
                    FileReader fileReader = null;
                    try {
                        FileReader fileReader2 = new FileReader(file);
                        context2 = context;
                        scriptable2 = scriptable;
                        try {
                            context2.evaluateReader(scriptable2, fileReader2, null, 0, null);
                            hashSet.add(file);
                            L.log.info(String.format("load success [%s]", file));
                            try {
                                fileReader2.close();
                            } catch (Exception unused) {
                            }
                        } catch (Throwable unused2) {
                            fileReader = fileReader2;
                            fileReader.close();
                            context = context2;
                            scriptable = scriptable2;
                        }
                    } catch (Throwable unused3) {
                        context2 = context;
                        scriptable2 = scriptable;
                    }
                    context = context2;
                    scriptable = scriptable2;
                }
            }
        }
        set.removeAll(hashSet);
        Iterator<File> it = set.iterator();
        while (it.hasNext()) {
            L.log.error(String.format("file load failed[%s]", it.next()));
        }
        return set.isEmpty();
    }

    @Override // zc.d
    public synchronized ad.a load() {
        Scriptable c11 = c.d().c();
        Context b11 = c.d().b();
        try {
            HashSet hashSet = new HashSet();
            b(hashSet, new File(this.f102543a));
            if (!c(b11, c11, hashSet)) {
                return null;
            }
            return a(b11, c11);
        } catch (Throwable th2) {
            try {
                L.log.error("load script error", th2);
                return null;
            } finally {
                Context.exit();
            }
        }
    }
}
