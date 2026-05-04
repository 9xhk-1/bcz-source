package androidx.media3.ui;

import android.content.res.Resources;
import android.text.TextUtils;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes.dex */
public class DefaultTrackNameProvider implements TrackNameProvider {
    private final Resources resources;

    public DefaultTrackNameProvider(Resources resources) {
        this.resources = (Resources) Assertions.checkNotNull(resources);
    }

    private String buildAudioChannelString(Format format) {
        int i11 = format.channelCount;
        return (i11 == -1 || i11 < 1) ? "" : i11 != 1 ? i11 != 2 ? (i11 == 6 || i11 == 7) ? this.resources.getString(R.string.exo_track_surround_5_point_1) : i11 != 8 ? this.resources.getString(R.string.exo_track_surround) : this.resources.getString(R.string.exo_track_surround_7_point_1) : this.resources.getString(R.string.exo_track_stereo) : this.resources.getString(R.string.exo_track_mono);
    }

    private String buildBitrateString(Format format) {
        int i11 = format.bitrate;
        return i11 == -1 ? "" : this.resources.getString(R.string.exo_track_bitrate, Float.valueOf(i11 / 1000000.0f));
    }

    private String buildLabelString(Format format) {
        return TextUtils.isEmpty(format.label) ? "" : format.label;
    }

    private String buildLanguageOrLabelString(Format format) {
        String joinWithSeparator = joinWithSeparator(buildLanguageString(format), buildRoleString(format));
        return TextUtils.isEmpty(joinWithSeparator) ? buildLabelString(format) : joinWithSeparator;
    }

    private String buildLanguageString(Format format) {
        String str = format.language;
        if (TextUtils.isEmpty(str) || C.LANGUAGE_UNDETERMINED.equals(str)) {
            return "";
        }
        Locale forLanguageTag = Locale.forLanguageTag(str);
        Locale defaultDisplayLocale = Util.getDefaultDisplayLocale();
        String displayName = forLanguageTag.getDisplayName(defaultDisplayLocale);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int offsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, offsetByCodePoints).toUpperCase(defaultDisplayLocale) + displayName.substring(offsetByCodePoints);
        } catch (IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    private String buildResolutionString(Format format) {
        int i11 = format.width;
        int i12 = format.height;
        return (i11 == -1 || i12 == -1) ? "" : this.resources.getString(R.string.exo_track_resolution, Integer.valueOf(i11), Integer.valueOf(i12));
    }

    private String buildRoleString(Format format) {
        String string = (format.roleFlags & 2) != 0 ? this.resources.getString(R.string.exo_track_role_alternate) : "";
        if ((format.roleFlags & 4) != 0) {
            string = joinWithSeparator(string, this.resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((format.roleFlags & 8) != 0) {
            string = joinWithSeparator(string, this.resources.getString(R.string.exo_track_role_commentary));
        }
        return (format.roleFlags & 1088) != 0 ? joinWithSeparator(string, this.resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    private static int inferPrimaryTrackType(Format format) {
        int trackType = MimeTypes.getTrackType(format.sampleMimeType);
        if (trackType != -1) {
            return trackType;
        }
        if (MimeTypes.getVideoMediaMimeType(format.codecs) != null) {
            return 2;
        }
        if (MimeTypes.getAudioMediaMimeType(format.codecs) != null) {
            return 1;
        }
        if (format.width == -1 && format.height == -1) {
            return (format.channelCount == -1 && format.sampleRate == -1) ? -1 : 1;
        }
        return 2;
    }

    private String joinWithSeparator(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                str = TextUtils.isEmpty(str) ? str2 : this.resources.getString(R.string.exo_item_list, str, str2);
            }
        }
        return str;
    }

    @Override // androidx.media3.ui.TrackNameProvider
    public String getTrackName(Format format) {
        int inferPrimaryTrackType = inferPrimaryTrackType(format);
        String joinWithSeparator = inferPrimaryTrackType == 2 ? joinWithSeparator(buildRoleString(format), buildResolutionString(format), buildBitrateString(format)) : inferPrimaryTrackType == 1 ? joinWithSeparator(buildLanguageOrLabelString(format), buildAudioChannelString(format), buildBitrateString(format)) : buildLanguageOrLabelString(format);
        if (joinWithSeparator.length() != 0) {
            return joinWithSeparator;
        }
        String str = format.language;
        return (str == null || str.trim().isEmpty()) ? this.resources.getString(R.string.exo_track_unknown) : this.resources.getString(R.string.exo_track_unknown_name, str);
    }
}
