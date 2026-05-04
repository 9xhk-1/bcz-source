package com.baicizhan.client.business.util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class HighLightMatcher {
    public static Pattern ENGLISH_WORD_PATTERN = Pattern.compile("([a-zA-Z']+(-[a-zA-Z]+)*)");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Segment {
        private int end;
        private int start;
        private String word;

        public Segment(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int getEnd() {
            return this.end;
        }

        public int getStart() {
            return this.start;
        }

        public String getWord() {
            return this.word;
        }

        public void setWord(String word) {
            this.word = word;
        }
    }

    public static List<Segment> splitEnglishWords(CharSequence sentence) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = ENGLISH_WORD_PATTERN.matcher(sentence);
        while (matcher.find()) {
            Segment segment = new Segment(matcher.start(), matcher.end());
            segment.setWord(matcher.group());
            arrayList.add(segment);
        }
        return arrayList;
    }
}
