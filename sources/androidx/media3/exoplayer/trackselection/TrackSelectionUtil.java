package androidx.media3.exoplayer.trackselection;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.Tracks;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.MappingTrackSelector;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class TrackSelectionUtil {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface AdaptiveTrackSelectionFactory {
        ExoTrackSelection createAdaptiveTrackSelection(ExoTrackSelection.Definition definition);
    }

    private TrackSelectionUtil() {
    }

    public static Tracks buildTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, TrackSelection[] trackSelectionArr) {
        List[] listArr = new List[trackSelectionArr.length];
        for (int i11 = 0; i11 < trackSelectionArr.length; i11++) {
            TrackSelection trackSelection = trackSelectionArr[i11];
            listArr[i11] = trackSelection != null ? ImmutableList.of(trackSelection) : ImmutableList.of();
        }
        return buildTracks(mappedTrackInfo, (List<? extends TrackSelection>[]) listArr);
    }

    public static LoadErrorHandlingPolicy.FallbackOptions createFallbackOptions(ExoTrackSelection exoTrackSelection) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = exoTrackSelection.length();
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (exoTrackSelection.isTrackExcluded(i12, elapsedRealtime)) {
                i11++;
            }
        }
        return new LoadErrorHandlingPolicy.FallbackOptions(1, 0, length, i11);
    }

    public static ExoTrackSelection[] createTrackSelectionsForDefinitions(ExoTrackSelection.Definition[] definitionArr, AdaptiveTrackSelectionFactory adaptiveTrackSelectionFactory) {
        ExoTrackSelection[] exoTrackSelectionArr = new ExoTrackSelection[definitionArr.length];
        boolean z11 = false;
        for (int i11 = 0; i11 < definitionArr.length; i11++) {
            ExoTrackSelection.Definition definition = definitionArr[i11];
            if (definition != null) {
                int[] iArr = definition.tracks;
                if (iArr.length <= 1 || z11) {
                    exoTrackSelectionArr[i11] = new FixedTrackSelection(definition.group, iArr[0], definition.type);
                } else {
                    exoTrackSelectionArr[i11] = adaptiveTrackSelectionFactory.createAdaptiveTrackSelection(definition);
                    z11 = true;
                }
            }
        }
        return exoTrackSelectionArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
    
        if ((r6 > r7) != (r4 > r5)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Point getMaxVideoSizeInViewport(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto Lf
            r3 = 0
            r0 = 1
            if (r6 <= r7) goto L8
            r1 = r0
            goto L9
        L8:
            r1 = r3
        L9:
            if (r4 <= r5) goto Lc
            r3 = r0
        Lc:
            if (r1 == r3) goto Lf
            goto L12
        Lf:
            r2 = r5
            r5 = r4
            r4 = r2
        L12:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L22
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = androidx.media3.common.util.Util.ceilDivide(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L22:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = androidx.media3.common.util.Util.ceilDivide(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.trackselection.TrackSelectionUtil.getMaxVideoSizeInViewport(boolean, int, int, int, int):android.graphics.Point");
    }

    @Deprecated
    public static DefaultTrackSelector.Parameters updateParametersWithOverride(DefaultTrackSelector.Parameters parameters, int i11, TrackGroupArray trackGroupArray, boolean z11, @Nullable DefaultTrackSelector.SelectionOverride selectionOverride) {
        DefaultTrackSelector.Parameters.Builder rendererDisabled = parameters.buildUpon().clearSelectionOverrides(i11).setRendererDisabled(i11, z11);
        if (selectionOverride != null) {
            rendererDisabled.setSelectionOverride(i11, trackGroupArray, selectionOverride);
        }
        return rendererDisabled.build();
    }

    public static Tracks buildTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, List<? extends TrackSelection>[] listArr) {
        boolean z11;
        ImmutableList.a aVar = new ImmutableList.a();
        for (int i11 = 0; i11 < mappedTrackInfo.getRendererCount(); i11++) {
            TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i11);
            List<? extends TrackSelection> list = listArr[i11];
            for (int i12 = 0; i12 < trackGroups.length; i12++) {
                TrackGroup trackGroup = trackGroups.get(i12);
                boolean z12 = mappedTrackInfo.getAdaptiveSupport(i11, i12, false) != 0;
                int i13 = trackGroup.length;
                int[] iArr = new int[i13];
                boolean[] zArr = new boolean[i13];
                for (int i14 = 0; i14 < trackGroup.length; i14++) {
                    iArr[i14] = mappedTrackInfo.getTrackSupport(i11, i12, i14);
                    int i15 = 0;
                    while (true) {
                        if (i15 >= list.size()) {
                            z11 = false;
                            break;
                        }
                        TrackSelection trackSelection = list.get(i15);
                        if (trackSelection.getTrackGroup().equals(trackGroup) && trackSelection.indexOf(i14) != -1) {
                            z11 = true;
                            break;
                        }
                        i15++;
                    }
                    zArr[i14] = z11;
                }
                aVar.g(new Tracks.Group(trackGroup, z12, iArr, zArr));
            }
        }
        TrackGroupArray unmappedTrackGroups = mappedTrackInfo.getUnmappedTrackGroups();
        for (int i16 = 0; i16 < unmappedTrackGroups.length; i16++) {
            TrackGroup trackGroup2 = unmappedTrackGroups.get(i16);
            int[] iArr2 = new int[trackGroup2.length];
            Arrays.fill(iArr2, 0);
            aVar.g(new Tracks.Group(trackGroup2, false, iArr2, new boolean[trackGroup2.length]));
        }
        return new Tracks(aVar.e());
    }
}
