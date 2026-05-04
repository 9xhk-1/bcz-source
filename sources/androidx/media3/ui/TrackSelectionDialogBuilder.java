package androidx.media3.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AlertDialog;
import androidx.media3.common.Format;
import androidx.media3.common.Player;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes.dex */
public final class TrackSelectionDialogBuilder {
    private boolean allowAdaptiveSelections;
    private boolean allowMultipleOverrides;
    private final DialogCallback callback;
    private final Context context;
    private boolean isDisabled;
    private ImmutableMap<TrackGroup, TrackSelectionOverride> overrides;
    private boolean showDisableOption;

    @StyleRes
    private int themeResId;
    private final CharSequence title;

    @Nullable
    private Comparator<Format> trackFormatComparator;
    private final List<Tracks.Group> trackGroups;

    @Nullable
    private TrackNameProvider trackNameProvider;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface DialogCallback {
        void onTracksSelected(boolean z11, Map<TrackGroup, TrackSelectionOverride> map);
    }

    public TrackSelectionDialogBuilder(Context context, CharSequence charSequence, List<Tracks.Group> list, DialogCallback dialogCallback) {
        this.context = context;
        this.title = charSequence;
        this.trackGroups = ImmutableList.copyOf((Collection) list);
        this.callback = dialogCallback;
        this.overrides = ImmutableMap.of();
    }

    public static /* synthetic */ void a(Player player, int i11, boolean z11, Map map) {
        if (player.isCommandAvailable(29)) {
            TrackSelectionParameters.Builder buildUpon = player.getTrackSelectionParameters().buildUpon();
            buildUpon.setTrackTypeDisabled(i11, z11);
            buildUpon.clearOverridesOfType(i11);
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                buildUpon.addOverride((TrackSelectionOverride) it.next());
            }
            player.setTrackSelectionParameters(buildUpon.build());
        }
    }

    @Nullable
    private Dialog buildForAndroidX() {
        try {
            Class cls = Integer.TYPE;
            Object newInstance = AlertDialog.Builder.class.getConstructor(Context.class, cls).newInstance(this.context, Integer.valueOf(this.themeResId));
            View inflate = LayoutInflater.from((Context) AlertDialog.Builder.class.getMethod("getContext", null).invoke(newInstance, null)).inflate(R.layout.exo_track_selection_dialog, (ViewGroup) null);
            DialogInterface.OnClickListener upDialogView = setUpDialogView(inflate);
            AlertDialog.Builder.class.getMethod(com.alipay.sdk.m.x.d.f11169o, CharSequence.class).invoke(newInstance, this.title);
            AlertDialog.Builder.class.getMethod("setView", View.class).invoke(newInstance, inflate);
            AlertDialog.Builder.class.getMethod("setPositiveButton", cls, DialogInterface.OnClickListener.class).invoke(newInstance, Integer.valueOf(android.R.string.ok), upDialogView);
            AlertDialog.Builder.class.getMethod("setNegativeButton", cls, DialogInterface.OnClickListener.class).invoke(newInstance, Integer.valueOf(android.R.string.cancel), null);
            return (Dialog) AlertDialog.Builder.class.getMethod("create", null).invoke(newInstance, null);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Exception e11) {
            throw new IllegalStateException(e11);
        }
    }

    private Dialog buildForPlatform() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.context, this.themeResId);
        View inflate = LayoutInflater.from(builder.getContext()).inflate(R.layout.exo_track_selection_dialog, (ViewGroup) null);
        return builder.setTitle(this.title).setView(inflate).setPositiveButton(android.R.string.ok, setUpDialogView(inflate)).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).create();
    }

    private DialogInterface.OnClickListener setUpDialogView(View view) {
        final TrackSelectionView trackSelectionView = (TrackSelectionView) view.findViewById(R.id.exo_track_selection_view);
        trackSelectionView.setAllowMultipleOverrides(this.allowMultipleOverrides);
        trackSelectionView.setAllowAdaptiveSelections(this.allowAdaptiveSelections);
        trackSelectionView.setShowDisableOption(this.showDisableOption);
        TrackNameProvider trackNameProvider = this.trackNameProvider;
        if (trackNameProvider != null) {
            trackSelectionView.setTrackNameProvider(trackNameProvider);
        }
        trackSelectionView.init(this.trackGroups, this.isDisabled, this.overrides, this.trackFormatComparator, null);
        return new DialogInterface.OnClickListener() { // from class: androidx.media3.ui.s0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                TrackSelectionDialogBuilder.this.callback.onTracksSelected(r1.getIsDisabled(), trackSelectionView.getOverrides());
            }
        };
    }

    public Dialog build() {
        Dialog buildForAndroidX = buildForAndroidX();
        return buildForAndroidX == null ? buildForPlatform() : buildForAndroidX;
    }

    public TrackSelectionDialogBuilder setAllowAdaptiveSelections(boolean z11) {
        this.allowAdaptiveSelections = z11;
        return this;
    }

    public TrackSelectionDialogBuilder setAllowMultipleOverrides(boolean z11) {
        this.allowMultipleOverrides = z11;
        return this;
    }

    public TrackSelectionDialogBuilder setIsDisabled(boolean z11) {
        this.isDisabled = z11;
        return this;
    }

    public TrackSelectionDialogBuilder setOverride(@Nullable TrackSelectionOverride trackSelectionOverride) {
        return setOverrides(trackSelectionOverride == null ? Collections.EMPTY_MAP : ImmutableMap.of(trackSelectionOverride.mediaTrackGroup, trackSelectionOverride));
    }

    public TrackSelectionDialogBuilder setOverrides(Map<TrackGroup, TrackSelectionOverride> map) {
        this.overrides = ImmutableMap.copyOf((Map) map);
        return this;
    }

    public TrackSelectionDialogBuilder setShowDisableOption(boolean z11) {
        this.showDisableOption = z11;
        return this;
    }

    public TrackSelectionDialogBuilder setTheme(@StyleRes int i11) {
        this.themeResId = i11;
        return this;
    }

    public void setTrackFormatComparator(@Nullable Comparator<Format> comparator) {
        this.trackFormatComparator = comparator;
    }

    public TrackSelectionDialogBuilder setTrackNameProvider(@Nullable TrackNameProvider trackNameProvider) {
        this.trackNameProvider = trackNameProvider;
        return this;
    }

    public TrackSelectionDialogBuilder(Context context, CharSequence charSequence, final Player player, final int i11) {
        this.context = context;
        this.title = charSequence;
        ImmutableList<Tracks.Group> groups = (player.isCommandAvailable(30) ? player.getCurrentTracks() : Tracks.EMPTY).getGroups();
        this.trackGroups = new ArrayList();
        for (int i12 = 0; i12 < groups.size(); i12++) {
            Tracks.Group group = groups.get(i12);
            if (group.getType() == i11) {
                this.trackGroups.add(group);
            }
        }
        this.overrides = player.getTrackSelectionParameters().overrides;
        this.callback = new DialogCallback() { // from class: androidx.media3.ui.t0
            @Override // androidx.media3.ui.TrackSelectionDialogBuilder.DialogCallback
            public final void onTracksSelected(boolean z11, Map map) {
                TrackSelectionDialogBuilder.a(Player.this, i11, z11, map);
            }
        };
    }
}
