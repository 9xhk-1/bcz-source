package androidx.media3.extractor.text.cea;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleDecoderException;
import androidx.media3.extractor.text.SubtitleInputBuffer;
import androidx.media3.extractor.text.SubtitleOutputBuffer;
import com.baicizhan.main.vld.bonding.j;
import com.jiongji.andriod.card.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ws.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class Cea608Decoder extends CeaDecoder {
    private static final int CC_FIELD_FLAG = 1;
    private static final byte CC_IMPLICIT_DATA_HEADER = -4;
    private static final int CC_MODE_PAINT_ON = 3;
    private static final int CC_MODE_POP_ON = 2;
    private static final int CC_MODE_ROLL_UP = 1;
    private static final int CC_MODE_UNKNOWN = 0;
    private static final int CC_TYPE_FLAG = 2;
    private static final int CC_VALID_FLAG = 4;
    private static final byte CTRL_BACKSPACE = 33;
    private static final byte CTRL_CARRIAGE_RETURN = 45;
    private static final byte CTRL_DELETE_TO_END_OF_ROW = 36;
    private static final byte CTRL_END_OF_CAPTION = 47;
    private static final byte CTRL_ERASE_DISPLAYED_MEMORY = 44;
    private static final byte CTRL_ERASE_NON_DISPLAYED_MEMORY = 46;
    private static final byte CTRL_RESUME_CAPTION_LOADING = 32;
    private static final byte CTRL_RESUME_DIRECT_CAPTIONING = 41;
    private static final byte CTRL_RESUME_TEXT_DISPLAY = 43;
    private static final byte CTRL_ROLL_UP_CAPTIONS_2_ROWS = 37;
    private static final byte CTRL_ROLL_UP_CAPTIONS_3_ROWS = 38;
    private static final byte CTRL_ROLL_UP_CAPTIONS_4_ROWS = 39;
    private static final byte CTRL_TEXT_RESTART = 42;
    private static final int DEFAULT_CAPTIONS_ROW_COUNT = 4;
    public static final long MIN_DATA_CHANNEL_TIMEOUT_MS = 16000;
    private static final int NTSC_CC_CHANNEL_1 = 0;
    private static final int NTSC_CC_CHANNEL_2 = 1;
    private static final int NTSC_CC_FIELD_1 = 0;
    private static final int NTSC_CC_FIELD_2 = 1;
    private static final int STYLE_ITALICS = 7;
    private static final int STYLE_UNCHANGED = 8;
    private static final String TAG = "Cea608Decoder";
    private int captionMode;
    private int captionRowCount;

    @Nullable
    private List<Cue> cues;
    private boolean isCaptionValid;
    private boolean isInCaptionService;
    private long lastCueUpdateUs;

    @Nullable
    private List<Cue> lastCues;
    private final int packetLength;
    private byte repeatableControlCc1;
    private byte repeatableControlCc2;
    private boolean repeatableControlSet;
    private final int selectedChannel;
    private final int selectedField;
    private final long validDataChannelTimeoutUs;
    private static final int[] ROW_INDICES = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] COLUMN_INDICES = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] STYLE_COLORS = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] BASIC_CHARACTER_SET = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, R.styleable.Theme_drawable_tab_lecture, 93, R.styleable.Theme_drawable_tab_mall_new, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, R.styleable.Theme_drawable_tab_friends_new, R.styleable.Theme_drawable_walk_sound3, 209, R.styleable.Theme_drawable_test_nodate, 9632};
    private static final int[] SPECIAL_CHARACTER_SET = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, R.styleable.Theme_drawable_tab_home, 226, R.styleable.Theme_drawable_tab_lecture_new, R.styleable.Theme_drawable_tab_review, 244, R.styleable.Theme_drawable_wiki_sound};
    private static final int[] SPECIAL_ES_FR_CHARACTER_SET = {193, 201, 211, 218, R.styleable.Theme_drawable_share, R.styleable.Theme_drawable_wiki_sound1, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, R.styleable.Theme_drawable_tab_mall, 206, 207, R.styleable.Theme_drawable_tab_surrounding, 212, 217, 249, R.styleable.Theme_drawable_searchwords, 171, 187};
    private static final int[] SPECIAL_PT_DE_CHARACTER_SET = {195, R.styleable.Theme_drawable_syncview, 205, 204, R.styleable.Theme_drawable_tab_mall_1111, 210, R.styleable.Theme_drawable_time, R.styleable.Theme_drawable_reset_plan, R.styleable.Theme_drawable_walk_sound1, 123, 125, 92, 94, 95, 124, 126, 196, R.styleable.Theme_drawable_syncview_error, R.styleable.Theme_drawable_review_sound, R.styleable.Theme_drawable_walk_sound2, R.styleable.Theme_drawable_sound1, 165, 164, 9474, 197, R.styleable.Theme_drawable_syncview_update, R.styleable.Theme_drawable_right_arrow, R.styleable.Theme_drawable_walk_sound4, 9484, 9488, 9492, 9496};
    private static final boolean[] ODD_PARITY_BYTE_TABLE = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private final ParsableByteArray ccData = new ParsableByteArray();
    private final ArrayList<CueBuilder> cueBuilders = new ArrayList<>();
    private CueBuilder currentCueBuilder = new CueBuilder(0, 4);
    private int currentChannel = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class CueBuilder {
        private static final int BASE_ROW = 15;
        private static final int SCREEN_CHARWIDTH = 32;
        private int captionMode;
        private int captionRowCount;
        private int indent;
        private int row;
        private int tabOffset;
        private final List<CueStyle> cueStyles = new ArrayList();
        private final List<SpannableString> rolledUpCaptions = new ArrayList();
        private final StringBuilder captionStringBuilder = new StringBuilder();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class CueStyle {
            public int start;
            public final int style;
            public final boolean underline;

            public CueStyle(int i11, boolean z11, int i12) {
                this.style = i11;
                this.underline = z11;
                this.start = i12;
            }
        }

        public CueBuilder(int i11, int i12) {
            reset(i11);
            this.captionRowCount = i12;
        }

        private SpannableString buildCurrentLine() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.captionStringBuilder);
            int length = spannableStringBuilder.length();
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = 0;
            int i16 = 0;
            boolean z11 = false;
            while (i15 < this.cueStyles.size()) {
                CueStyle cueStyle = this.cueStyles.get(i15);
                boolean z12 = cueStyle.underline;
                int i17 = cueStyle.style;
                if (i17 != 8) {
                    boolean z13 = i17 == 7;
                    if (i17 != 7) {
                        i14 = Cea608Decoder.STYLE_COLORS[i17];
                    }
                    z11 = z13;
                }
                int i18 = cueStyle.start;
                i15++;
                if (i18 != (i15 < this.cueStyles.size() ? this.cueStyles.get(i15).start : length)) {
                    if (i11 != -1 && !z12) {
                        setUnderlineSpan(spannableStringBuilder, i11, i18);
                        i11 = -1;
                    } else if (i11 == -1 && z12) {
                        i11 = i18;
                    }
                    if (i12 != -1 && !z11) {
                        setItalicSpan(spannableStringBuilder, i12, i18);
                        i12 = -1;
                    } else if (i12 == -1 && z11) {
                        i12 = i18;
                    }
                    if (i14 != i13) {
                        setColorSpan(spannableStringBuilder, i16, i18, i13);
                        i13 = i14;
                        i16 = i18;
                    }
                }
            }
            if (i11 != -1 && i11 != length) {
                setUnderlineSpan(spannableStringBuilder, i11, length);
            }
            if (i12 != -1 && i12 != length) {
                setItalicSpan(spannableStringBuilder, i12, length);
            }
            if (i16 != length) {
                setColorSpan(spannableStringBuilder, i16, length, i13);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void setColorSpan(SpannableStringBuilder spannableStringBuilder, int i11, int i12, int i13) {
            if (i13 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i13), i11, i12, 33);
        }

        private static void setItalicSpan(SpannableStringBuilder spannableStringBuilder, int i11, int i12) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i11, i12, 33);
        }

        private static void setUnderlineSpan(SpannableStringBuilder spannableStringBuilder, int i11, int i12) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i12, 33);
        }

        public void append(char c11) {
            if (this.captionStringBuilder.length() < 32) {
                this.captionStringBuilder.append(c11);
            }
        }

        public void backspace() {
            int length = this.captionStringBuilder.length();
            if (length > 0) {
                this.captionStringBuilder.delete(length - 1, length);
                for (int size = this.cueStyles.size() - 1; size >= 0; size--) {
                    CueStyle cueStyle = this.cueStyles.get(size);
                    int i11 = cueStyle.start;
                    if (i11 != length) {
                        return;
                    }
                    cueStyle.start = i11 - 1;
                }
            }
        }

        @Nullable
        public Cue build(int i11) {
            float f11;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i12 = 0; i12 < this.rolledUpCaptions.size(); i12++) {
                spannableStringBuilder.append((CharSequence) this.rolledUpCaptions.get(i12));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) buildCurrentLine());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i13 = this.indent + this.tabOffset;
            int length = (32 - i13) - spannableStringBuilder.length();
            int i14 = i13 - length;
            if (i11 == Integer.MIN_VALUE) {
                i11 = (this.captionMode != 2 || (Math.abs(i14) >= 3 && length >= 0)) ? (this.captionMode != 2 || i14 <= 0) ? 0 : 2 : 1;
            }
            if (i11 != 1) {
                if (i11 == 2) {
                    i13 = 32 - length;
                }
                f11 = ((i13 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f11 = 0.5f;
            }
            int i15 = this.row;
            if (i15 > 7) {
                i15 -= 17;
            } else if (this.captionMode == 1) {
                i15 -= this.captionRowCount - 1;
            }
            return new Cue.Builder().setText(spannableStringBuilder).setTextAlignment(Layout.Alignment.ALIGN_NORMAL).setLine(i15, 1).setPosition(f11).setPositionAnchor(i11).build();
        }

        public boolean isEmpty() {
            return this.cueStyles.isEmpty() && this.rolledUpCaptions.isEmpty() && this.captionStringBuilder.length() == 0;
        }

        public void reset(int i11) {
            this.captionMode = i11;
            this.cueStyles.clear();
            this.rolledUpCaptions.clear();
            this.captionStringBuilder.setLength(0);
            this.row = 15;
            this.indent = 0;
            this.tabOffset = 0;
        }

        public void rollUp() {
            this.rolledUpCaptions.add(buildCurrentLine());
            this.captionStringBuilder.setLength(0);
            this.cueStyles.clear();
            int min = Math.min(this.captionRowCount, this.row);
            while (this.rolledUpCaptions.size() >= min) {
                this.rolledUpCaptions.remove(0);
            }
        }

        public void setCaptionMode(int i11) {
            this.captionMode = i11;
        }

        public void setCaptionRowCount(int i11) {
            this.captionRowCount = i11;
        }

        public void setStyle(int i11, boolean z11) {
            this.cueStyles.add(new CueStyle(i11, z11, this.captionStringBuilder.length()));
        }
    }

    public Cea608Decoder(String str, int i11, long j11) {
        if (j11 != C.TIME_UNSET) {
            Assertions.checkArgument(j11 >= MIN_DATA_CHANNEL_TIMEOUT_MS);
            this.validDataChannelTimeoutUs = j11 * 1000;
        } else {
            this.validDataChannelTimeoutUs = C.TIME_UNSET;
        }
        this.packetLength = MimeTypes.APPLICATION_MP4CEA608.equals(str) ? 2 : 3;
        if (i11 == 1) {
            this.selectedChannel = 0;
            this.selectedField = 0;
        } else if (i11 == 2) {
            this.selectedChannel = 1;
            this.selectedField = 0;
        } else if (i11 == 3) {
            this.selectedChannel = 0;
            this.selectedField = 1;
        } else if (i11 != 4) {
            Log.w(TAG, "Invalid channel. Defaulting to CC1.");
            this.selectedChannel = 0;
            this.selectedField = 0;
        } else {
            this.selectedChannel = 1;
            this.selectedField = 1;
        }
        setCaptionMode(0);
        resetCueBuilders();
        this.isInCaptionService = true;
        this.lastCueUpdateUs = C.TIME_UNSET;
    }

    private static char getBasicChar(byte b11) {
        return (char) BASIC_CHARACTER_SET[(b11 & Byte.MAX_VALUE) - 32];
    }

    private static int getChannel(byte b11) {
        return (b11 >> 3) & 1;
    }

    private List<Cue> getDisplayCues() {
        int size = this.cueBuilders.size();
        ArrayList arrayList = new ArrayList(size);
        int i11 = 2;
        for (int i12 = 0; i12 < size; i12++) {
            Cue build = this.cueBuilders.get(i12).build(Integer.MIN_VALUE);
            arrayList.add(build);
            if (build != null) {
                i11 = Math.min(i11, build.positionAnchor);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i13 = 0; i13 < size; i13++) {
            Cue cue = (Cue) arrayList.get(i13);
            if (cue != null) {
                if (cue.positionAnchor != i11) {
                    cue = (Cue) Assertions.checkNotNull(this.cueBuilders.get(i13).build(i11));
                }
                arrayList2.add(cue);
            }
        }
        return arrayList2;
    }

    private static char getExtendedEsFrChar(byte b11) {
        return (char) SPECIAL_ES_FR_CHARACTER_SET[b11 & 31];
    }

    private static char getExtendedPtDeChar(byte b11) {
        return (char) SPECIAL_PT_DE_CHARACTER_SET[b11 & 31];
    }

    private static char getExtendedWestEuropeanChar(byte b11, byte b12) {
        return (b11 & 1) == 0 ? getExtendedEsFrChar(b12) : getExtendedPtDeChar(b12);
    }

    private static char getSpecialNorthAmericanChar(byte b11) {
        return (char) SPECIAL_CHARACTER_SET[b11 & 15];
    }

    private void handleMidrowCtrl(byte b11) {
        this.currentCueBuilder.append(' ');
        this.currentCueBuilder.setStyle((b11 >> 1) & 7, (b11 & 1) == 1);
    }

    private void handleMiscCode(byte b11) {
        if (b11 == 32) {
            setCaptionMode(2);
            return;
        }
        if (b11 == 41) {
            setCaptionMode(3);
            return;
        }
        switch (b11) {
            case 37:
                setCaptionMode(1);
                setCaptionRowCount(2);
                break;
            case 38:
                setCaptionMode(1);
                setCaptionRowCount(3);
                break;
            case 39:
                setCaptionMode(1);
                setCaptionRowCount(4);
                break;
            default:
                int i11 = this.captionMode;
                if (i11 != 0) {
                    if (b11 == 33) {
                        this.currentCueBuilder.backspace();
                        break;
                    } else {
                        switch (b11) {
                            case 44:
                                this.cues = Collections.EMPTY_LIST;
                                if (i11 == 1 || i11 == 3) {
                                    resetCueBuilders();
                                    break;
                                }
                            case 45:
                                if (i11 == 1 && !this.currentCueBuilder.isEmpty()) {
                                    this.currentCueBuilder.rollUp();
                                    break;
                                }
                                break;
                            case 46:
                                resetCueBuilders();
                                break;
                            case 47:
                                this.cues = getDisplayCues();
                                resetCueBuilders();
                                break;
                        }
                    }
                }
                break;
        }
    }

    private void handlePreambleAddressCode(byte b11, byte b12) {
        int i11 = ROW_INDICES[b11 & 7];
        if ((b12 & 32) != 0) {
            i11++;
        }
        if (i11 != this.currentCueBuilder.row) {
            if (this.captionMode != 1 && !this.currentCueBuilder.isEmpty()) {
                CueBuilder cueBuilder = new CueBuilder(this.captionMode, this.captionRowCount);
                this.currentCueBuilder = cueBuilder;
                this.cueBuilders.add(cueBuilder);
            }
            this.currentCueBuilder.row = i11;
        }
        boolean z11 = (b12 & 16) == 16;
        boolean z12 = (b12 & 1) == 1;
        int i12 = (b12 >> 1) & 7;
        this.currentCueBuilder.setStyle(z11 ? 8 : i12, z12);
        if (z11) {
            this.currentCueBuilder.indent = COLUMN_INDICES[i12];
        }
    }

    private static boolean isCtrlCode(byte b11) {
        return (b11 & c.f96768m) == 0;
    }

    private static boolean isExtendedWestEuropeanChar(byte b11, byte b12) {
        return (b11 & 246) == 18 && (b12 & c.f96768m) == 32;
    }

    private static boolean isMidrowCtrlCode(byte b11, byte b12) {
        return (b11 & 247) == 17 && (b12 & 240) == 32;
    }

    private static boolean isMiscCode(byte b11, byte b12) {
        return (b11 & 246) == 20 && (b12 & 240) == 32;
    }

    private static boolean isPreambleAddressCode(byte b11, byte b12) {
        return (b11 & 240) == 16 && (b12 & j.f25378c) == 64;
    }

    private static boolean isRepeatable(byte b11) {
        return (b11 & 240) == 16;
    }

    private boolean isRepeatedCommand(boolean z11, byte b11, byte b12) {
        if (!z11 || !isRepeatable(b11)) {
            this.repeatableControlSet = false;
        } else {
            if (this.repeatableControlSet && this.repeatableControlCc1 == b11 && this.repeatableControlCc2 == b12) {
                this.repeatableControlSet = false;
                return true;
            }
            this.repeatableControlSet = true;
            this.repeatableControlCc1 = b11;
            this.repeatableControlCc2 = b12;
        }
        return false;
    }

    private static boolean isServiceSwitchCommand(byte b11) {
        return (b11 & 246) == 20;
    }

    private static boolean isSpecialNorthAmericanChar(byte b11, byte b12) {
        return (b11 & 247) == 17 && (b12 & 240) == 48;
    }

    private static boolean isTabCtrlCode(byte b11, byte b12) {
        return (b11 & 247) == 23 && b12 >= 33 && b12 <= 35;
    }

    private static boolean isXdsControlCode(byte b11) {
        return 1 <= b11 && b11 <= 15;
    }

    private void maybeUpdateIsInCaptionService(byte b11, byte b12) {
        if (isXdsControlCode(b11)) {
            this.isInCaptionService = false;
            return;
        }
        if (isServiceSwitchCommand(b11)) {
            if (b12 != 32 && b12 != 47) {
                switch (b12) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b12) {
                            case 42:
                            case 43:
                                this.isInCaptionService = false;
                                break;
                        }
                        return;
                }
            }
            this.isInCaptionService = true;
        }
    }

    private void resetCueBuilders() {
        this.currentCueBuilder.reset(this.captionMode);
        this.cueBuilders.clear();
        this.cueBuilders.add(this.currentCueBuilder);
    }

    private void setCaptionMode(int i11) {
        int i12 = this.captionMode;
        if (i12 == i11) {
            return;
        }
        this.captionMode = i11;
        if (i11 == 3) {
            for (int i13 = 0; i13 < this.cueBuilders.size(); i13++) {
                this.cueBuilders.get(i13).setCaptionMode(i11);
            }
            return;
        }
        resetCueBuilders();
        if (i12 == 3 || i11 == 1 || i11 == 0) {
            this.cues = Collections.EMPTY_LIST;
        }
    }

    private void setCaptionRowCount(int i11) {
        this.captionRowCount = i11;
        this.currentCueBuilder.setCaptionRowCount(i11);
    }

    private boolean shouldClearStuckCaptions() {
        return (this.validDataChannelTimeoutUs == C.TIME_UNSET || this.lastCueUpdateUs == C.TIME_UNSET || getPositionUs() - this.lastCueUpdateUs < this.validDataChannelTimeoutUs) ? false : true;
    }

    private boolean updateAndVerifyCurrentChannel(byte b11) {
        if (isCtrlCode(b11)) {
            this.currentChannel = getChannel(b11);
        }
        return this.currentChannel == this.selectedChannel;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    public Subtitle createSubtitle() {
        List<Cue> list = this.cues;
        this.lastCues = list;
        return new CeaSubtitle((List) Assertions.checkNotNull(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0017 A[SYNTHETIC] */
    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void decode(androidx.media3.extractor.text.SubtitleInputBuffer r10) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.cea.Cea608Decoder.decode(androidx.media3.extractor.text.SubtitleInputBuffer):void");
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    @Nullable
    public /* bridge */ /* synthetic */ SubtitleInputBuffer dequeueInputBuffer() throws SubtitleDecoderException {
        return super.dequeueInputBuffer();
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public void flush() {
        super.flush();
        this.cues = null;
        this.lastCues = null;
        setCaptionMode(0);
        setCaptionRowCount(4);
        resetCueBuilders();
        this.isCaptionValid = false;
        this.repeatableControlSet = false;
        this.repeatableControlCc1 = (byte) 0;
        this.repeatableControlCc2 = (byte) 0;
        this.currentChannel = 0;
        this.isInCaptionService = true;
        this.lastCueUpdateUs = C.TIME_UNSET;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public String getName() {
        return TAG;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    public boolean isNewSubtitleDataAvailable() {
        return this.cues != this.lastCues;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    public /* bridge */ /* synthetic */ void queueInputBuffer(SubtitleInputBuffer subtitleInputBuffer) throws SubtitleDecoderException {
        super.queueInputBuffer(subtitleInputBuffer);
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.extractor.text.SubtitleDecoder
    public /* bridge */ /* synthetic */ void setPositionUs(long j11) {
        super.setPositionUs(j11);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    @Nullable
    public SubtitleOutputBuffer dequeueOutputBuffer() throws SubtitleDecoderException {
        SubtitleOutputBuffer availableOutputBuffer;
        SubtitleOutputBuffer dequeueOutputBuffer = super.dequeueOutputBuffer();
        if (dequeueOutputBuffer != null) {
            return dequeueOutputBuffer;
        }
        if (!shouldClearStuckCaptions() || (availableOutputBuffer = getAvailableOutputBuffer()) == null) {
            return null;
        }
        this.cues = Collections.EMPTY_LIST;
        this.lastCueUpdateUs = C.TIME_UNSET;
        availableOutputBuffer.setContent(getPositionUs(), createSubtitle(), Long.MAX_VALUE);
        return availableOutputBuffer;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public void release() {
    }
}
