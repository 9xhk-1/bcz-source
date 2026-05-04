package com.baicizhan.client.wordtesting.bean;

import android.text.TextUtils;
import bp.a;
import com.alipay.sdk.m.u.i;
import com.google.gson.d;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.junit.jupiter.api.j2;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class VocabStats {
    private static final SimpleDateFormat DATE_FORMAT;
    private static final SimpleDateFormat TODAY_FORMAT;
    private StatsContent data;
    private ErrorInfo error;
    private long latest_update_time;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StatsContent {
        private List<VocabEndPoint> coordinate;
        private List<Integer> vocabCurve;

        public StatsContent() {
            List list = Collections.EMPTY_LIST;
            this.vocabCurve = list;
            this.coordinate = list;
        }

        public List<VocabEndPoint> getCoordinate() {
            return this.coordinate;
        }

        public List<Integer> getVocabCurve() {
            return this.vocabCurve;
        }

        public void setCoordinate(List<VocabEndPoint> coordinate) {
            this.coordinate = coordinate;
        }

        public void setVocabCurve(List<Integer> vocabCurve) {
            this.vocabCurve = vocabCurve;
        }

        public String toString() {
            return TextUtils.join(j2.O, this.vocabCurve) + "\n" + TextUtils.join(j2.O, this.coordinate);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class VocabEndPoint {
        private float score;
        private int vocabulary;

        public float getScore() {
            return this.score;
        }

        public int getVocabulary() {
            return this.vocabulary;
        }

        public void setScore(float score) {
            this.score = score;
        }

        public void setVocabulary(int vocabulary) {
            this.vocabulary = vocabulary;
        }

        public String toString() {
            return "{vocabulary: " + this.vocabulary + "}\n{score: " + this.score + i.f11099d;
        }
    }

    static {
        Locale locale = Locale.CHINA;
        DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd hh:mm a", locale);
        TODAY_FORMAT = new SimpleDateFormat("今天 hh:mm a", locale);
    }

    public static VocabStats newSampleInstance() {
        return (VocabStats) new d().o("{\"error\":{\"code\":0,\"msg\":\"\"},\"data\":{\"vocabCurve\":[4000,5000,4090,6000,7000,9000,4500,6600,5609,7700],\"coordinate\":[{\"vocabulary\":4000,\"score\":60.5},{\"vocabulary\":9000,\"score\":90}]}}", new a<VocabStats>() { // from class: com.baicizhan.client.wordtesting.bean.VocabStats.1
        }.getType());
    }

    public StatsContent getData() {
        return this.data;
    }

    public ErrorInfo getError() {
        return this.error;
    }

    public String getFormatLatestUpdateTime() {
        if (this.latest_update_time <= 0) {
            return "";
        }
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(this.latest_update_time * 1000);
        return ((calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5)) ? TODAY_FORMAT : DATE_FORMAT).format(new Date(this.latest_update_time * 1000));
    }

    public long getLatest_update_time() {
        return this.latest_update_time;
    }

    public boolean isValid() {
        ErrorInfo errorInfo = this.error;
        if (errorInfo == null || this.data == null) {
            c.d("", "vocab stats data from net is null", new Object[0]);
            return false;
        }
        if (errorInfo.getCode() != 0) {
            c.d("", "vocab stats data from net is illegal, err code is [%d]", Integer.valueOf(this.error.getCode()));
            return false;
        }
        if (this.data.vocabCurve == null || this.data.vocabCurve.isEmpty()) {
            return false;
        }
        Iterator it = this.data.vocabCurve.iterator();
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (intValue < i11) {
                i11 = intValue;
            }
            if (intValue > i12) {
                i12 = intValue;
            }
        }
        if (this.data.coordinate != null) {
            if (2 == this.data.coordinate.size()) {
                if (i11 != ((VocabEndPoint) this.data.coordinate.get(0)).getVocabulary()) {
                    c.d("", "vocab stats data from net is inconsistence", new Object[0]);
                    return false;
                }
                if (i12 != ((VocabEndPoint) this.data.coordinate.get(1)).getVocabulary()) {
                    c.d("", "vocab stats data from net is inconsistence", new Object[0]);
                    return false;
                }
                if (i11 == i12 && ((VocabEndPoint) this.data.coordinate.get(0)).getScore() != ((VocabEndPoint) this.data.coordinate.get(1)).getScore()) {
                    c.d("", "vocab stats data from net is inconsistence", new Object[0]);
                    return false;
                }
            } else if (1 == this.data.coordinate.size()) {
                if (i11 != i12) {
                    return false;
                }
            } else if (this.data.coordinate.size() > 2) {
                return false;
            }
        }
        return true;
    }

    public void setData(StatsContent data) {
        this.data = data;
    }

    public void setError(ErrorInfo error) {
        this.error = error;
    }

    public void setLatest_update_time(long latest_update_time) {
        this.latest_update_time = latest_update_time;
    }

    public String toString() {
        return "Vocab stats [" + this.error.toString() + "]\n[" + this.data.toString();
    }
}
