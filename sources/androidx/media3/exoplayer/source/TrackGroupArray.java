package androidx.media3.exoplayer.source;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.q6;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class TrackGroupArray {
    public static final TrackGroupArray EMPTY = new TrackGroupArray(new TrackGroup[0]);
    private static final String FIELD_TRACK_GROUPS = Util.intToStringMaxRadix(0);
    private static final String TAG = "TrackGroupArray";
    private int hashCode;
    public final int length;
    private final ImmutableList<TrackGroup> trackGroups;

    public TrackGroupArray(TrackGroup... trackGroupArr) {
        this.trackGroups = ImmutableList.copyOf(trackGroupArr);
        this.length = trackGroupArr.length;
        verifyCorrectness();
    }

    public static TrackGroupArray fromBundle(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_TRACK_GROUPS);
        return parcelableArrayList == null ? new TrackGroupArray(new TrackGroup[0]) : new TrackGroupArray((TrackGroup[]) BundleCollectionUtil.fromBundleList(new ho.r() { // from class: androidx.media3.exoplayer.source.m0
            @Override // ho.r
            public final Object apply(Object obj) {
                return TrackGroup.fromBundle((Bundle) obj);
            }
        }, parcelableArrayList).toArray(new TrackGroup[0]));
    }

    private void verifyCorrectness() {
        int i11 = 0;
        while (i11 < this.trackGroups.size()) {
            int i12 = i11 + 1;
            for (int i13 = i12; i13 < this.trackGroups.size(); i13++) {
                if (this.trackGroups.get(i11).equals(this.trackGroups.get(i13))) {
                    Log.e(TAG, "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i11 = i12;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TrackGroupArray.class == obj.getClass()) {
            TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
            if (this.length == trackGroupArray.length && this.trackGroups.equals(trackGroupArray.trackGroups)) {
                return true;
            }
        }
        return false;
    }

    public TrackGroup get(int i11) {
        return this.trackGroups.get(i11);
    }

    public ImmutableList<Integer> getTrackTypes() {
        return ImmutableList.copyOf((Collection) q6.D(this.trackGroups, new ho.r() { // from class: androidx.media3.exoplayer.source.k0
            @Override // ho.r
            public final Object apply(Object obj) {
                Integer valueOf;
                valueOf = Integer.valueOf(((TrackGroup) obj).type);
                return valueOf;
            }
        }));
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = this.trackGroups.hashCode();
        }
        return this.hashCode;
    }

    public int indexOf(TrackGroup trackGroup) {
        int indexOf = this.trackGroups.indexOf(trackGroup);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(FIELD_TRACK_GROUPS, BundleCollectionUtil.toBundleArrayList(this.trackGroups, new ho.r() { // from class: androidx.media3.exoplayer.source.l0
            @Override // ho.r
            public final Object apply(Object obj) {
                return ((TrackGroup) obj).toBundle();
            }
        }));
        return bundle;
    }

    public String toString() {
        return this.trackGroups.toString();
    }
}
