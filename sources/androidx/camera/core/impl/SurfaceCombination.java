package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class SurfaceCombination {
    private final List<SurfaceConfig> mSurfaceConfigList = new ArrayList();

    private static void generateArrangements(List<int[]> list, int i11, int[] iArr, int i12) {
        if (i12 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = 0;
            while (true) {
                if (i14 >= i12) {
                    iArr[i12] = i13;
                    generateArrangements(list, i11, iArr, i12 + 1);
                    break;
                } else if (i13 == iArr[i14]) {
                    break;
                } else {
                    i14++;
                }
            }
        }
    }

    private List<int[]> getElementsArrangements(int i11) {
        ArrayList arrayList = new ArrayList();
        generateArrangements(arrayList, i11, new int[i11], 0);
        return arrayList;
    }

    public boolean addSurfaceConfig(@NonNull SurfaceConfig surfaceConfig) {
        return this.mSurfaceConfigList.add(surfaceConfig);
    }

    @Nullable
    public List<SurfaceConfig> getOrderedSupportedSurfaceConfigList(@NonNull List<SurfaceConfig> list) {
        int i11;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        if (list.size() != this.mSurfaceConfigList.size()) {
            return null;
        }
        List<int[]> elementsArrangements = getElementsArrangements(this.mSurfaceConfigList.size());
        SurfaceConfig[] surfaceConfigArr = new SurfaceConfig[list.size()];
        Iterator<int[]> it = elementsArrangements.iterator();
        while (true) {
            i11 = 0;
            if (!it.hasNext()) {
                break;
            }
            int[] next = it.next();
            boolean z11 = true;
            while (i11 < this.mSurfaceConfigList.size()) {
                if (next[i11] < list.size()) {
                    z11 &= this.mSurfaceConfigList.get(i11).isSupported(list.get(next[i11]));
                    if (!z11) {
                        break;
                    }
                    surfaceConfigArr[next[i11]] = this.mSurfaceConfigList.get(i11);
                }
                i11++;
            }
            if (z11) {
                i11 = 1;
                break;
            }
        }
        if (i11 != 0) {
            return Arrays.asList(surfaceConfigArr);
        }
        return null;
    }

    @NonNull
    public List<SurfaceConfig> getSurfaceConfigList() {
        return this.mSurfaceConfigList;
    }

    public boolean removeSurfaceConfig(@NonNull SurfaceConfig surfaceConfig) {
        return this.mSurfaceConfigList.remove(surfaceConfig);
    }
}
