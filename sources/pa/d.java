package pa;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d extends a {
    public d() {
        super("NewestDayStrategy");
    }

    @Override // pa.a
    public List<File> b(List<File> files, Object... args) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (File file : files) {
            if (file.getName().endsWith(a.f80315c)) {
                arrayList2.add(file);
            }
        }
        String format = new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            String str = ((File) it.next()).getName().replace(a.f80315c, "") + "_" + format;
            ArrayList arrayList3 = new ArrayList();
            for (File file2 : files) {
                if (file2.getName().contains(str)) {
                    arrayList3.add(file2);
                }
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(c(arrayList3));
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final File c(List<File> files) {
        long j11 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < files.size(); i12++) {
            if (files.get(i12).lastModified() > j11) {
                j11 = files.get(i12).lastModified();
                i11 = i12;
            }
        }
        return files.get(i11);
    }
}
