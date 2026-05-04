package androidx.camera.video;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.utils.AspectRatioUtil;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
class QualityRatioToResolutionsTable {
    private static final Map<Integer, Rational> sAspectRatioMap;
    private static final Map<Quality, Range<Integer>> sQualityRangeMap;
    private final Map<QualityRatio, List<Size>> mTable = new HashMap();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @eo.c
    public static abstract class QualityRatio {
        public static QualityRatio of(@NonNull Quality quality, int i11) {
            return new AutoValue_QualityRatioToResolutionsTable_QualityRatio(quality, i11);
        }

        public abstract int getAspectRatio();

        @NonNull
        public abstract Quality getQuality();
    }

    static {
        HashMap hashMap = new HashMap();
        sQualityRangeMap = hashMap;
        hashMap.put(Quality.UHD, Range.create(2160, 4319));
        hashMap.put(Quality.FHD, Range.create(Integer.valueOf(pd.a.f80340j), 1439));
        hashMap.put(Quality.HD, Range.create(720, 1079));
        hashMap.put(Quality.SD, Range.create(Integer.valueOf(com.jiongji.andriod.card.R.styleable.Theme_drawable_test_nodate), Integer.valueOf(AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD)));
        HashMap hashMap2 = new HashMap();
        sAspectRatioMap = hashMap2;
        hashMap2.put(0, AspectRatioUtil.ASPECT_RATIO_4_3);
        hashMap2.put(1, AspectRatioUtil.ASPECT_RATIO_16_9);
    }

    public QualityRatioToResolutionsTable(@NonNull List<Size> list, @NonNull Map<Quality, Size> map) {
        for (Quality quality : sQualityRangeMap.keySet()) {
            this.mTable.put(QualityRatio.of(quality, -1), new ArrayList());
            Iterator<Integer> it = sAspectRatioMap.keySet().iterator();
            while (it.hasNext()) {
                this.mTable.put(QualityRatio.of(quality, it.next().intValue()), new ArrayList());
            }
        }
        addProfileSizesToTable(map);
        addResolutionsToTable(list);
        sortQualityRatioRow(map);
    }

    public static /* synthetic */ int a(int i11, Size size, Size size2) {
        return Math.abs(SizeUtil.getArea(size) - i11) - Math.abs(SizeUtil.getArea(size2) - i11);
    }

    private void addProfileSizesToTable(@NonNull Map<Quality, Size> map) {
        for (Map.Entry<Quality, Size> entry : map.entrySet()) {
            List<Size> qualityRatioRow = getQualityRatioRow(entry.getKey(), -1);
            Objects.requireNonNull(qualityRatioRow);
            qualityRatioRow.add(entry.getValue());
        }
    }

    private void addResolutionsToTable(@NonNull List<Size> list) {
        Integer findMappedAspectRatio;
        for (Size size : list) {
            Quality findMappedQuality = findMappedQuality(size);
            if (findMappedQuality != null && (findMappedAspectRatio = findMappedAspectRatio(size)) != null) {
                List<Size> qualityRatioRow = getQualityRatioRow(findMappedQuality, findMappedAspectRatio.intValue());
                Objects.requireNonNull(qualityRatioRow);
                qualityRatioRow.add(size);
            }
        }
    }

    @Nullable
    private static Integer findMappedAspectRatio(@NonNull Size size) {
        for (Map.Entry<Integer, Rational> entry : sAspectRatioMap.entrySet()) {
            if (AspectRatioUtil.hasMatchingAspectRatio(size, entry.getValue(), SizeUtil.RESOLUTION_QVGA)) {
                return entry.getKey();
            }
        }
        return null;
    }

    @Nullable
    private static Quality findMappedQuality(@NonNull Size size) {
        for (Map.Entry<Quality, Range<Integer>> entry : sQualityRangeMap.entrySet()) {
            if (entry.getValue().contains((Range<Integer>) Integer.valueOf(size.getHeight()))) {
                return entry.getKey();
            }
        }
        return null;
    }

    @Nullable
    private List<Size> getQualityRatioRow(@NonNull Quality quality, int i11) {
        return this.mTable.get(QualityRatio.of(quality, i11));
    }

    private void sortQualityRatioRow(@NonNull Map<Quality, Size> map) {
        for (Map.Entry<QualityRatio, List<Size>> entry : this.mTable.entrySet()) {
            Size size = map.get(entry.getKey().getQuality());
            if (size != null) {
                final int area = SizeUtil.getArea(size);
                Collections.sort(entry.getValue(), new Comparator() { // from class: androidx.camera.video.a
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return QualityRatioToResolutionsTable.a(area, (Size) obj, (Size) obj2);
                    }
                });
            }
        }
    }

    @NonNull
    public List<Size> getResolutions(@NonNull Quality quality, int i11) {
        List<Size> qualityRatioRow = getQualityRatioRow(quality, i11);
        return qualityRatioRow != null ? new ArrayList(qualityRatioRow) : new ArrayList(0);
    }
}
