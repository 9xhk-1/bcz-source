package sl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fm.openinstall.model.AppData;

/* loaded from: classes6.dex */
public abstract class d implements e {
    @Override // sl.e
    public void a(@Nullable AppData appData, @Nullable tl.a aVar) {
        if (aVar != null || appData == null || appData.isEmpty()) {
            return;
        }
        b(appData);
    }

    public abstract void b(@NonNull AppData appData);
}
