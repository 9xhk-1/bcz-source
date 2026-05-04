package androidx.compose.runtime.tooling;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import java.util.Set;
import m80.k;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class InspectionTablesKt {

    @k
    private static final ProvidableCompositionLocal<Set<CompositionData>> LocalInspectionTables = CompositionLocalKt.staticCompositionLocalOf(new a<Set<CompositionData>>() { // from class: androidx.compose.runtime.tooling.InspectionTablesKt$LocalInspectionTables$1
        @Override // x00.a
        public final Set<CompositionData> invoke() {
            return null;
        }
    });

    @k
    public static final ProvidableCompositionLocal<Set<CompositionData>> getLocalInspectionTables() {
        return LocalInspectionTables;
    }
}
