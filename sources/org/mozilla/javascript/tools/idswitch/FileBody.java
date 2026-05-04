package org.mozilla.javascript.tools.idswitch;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class FileBody {
    private char[] buffer = new char[16384];
    private int bufferEnd;
    ReplaceItem firstReplace;
    ReplaceItem lastReplace;
    private int lineBegin;
    private int lineEnd;
    private int lineNumber;
    private int nextLineStart;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ReplaceItem {
        int begin;
        int end;
        ReplaceItem next;
        String replacement;

        public ReplaceItem(int i11, int i12, String str) {
            this.begin = i11;
            this.end = i12;
            this.replacement = str;
        }
    }

    private static boolean equals(String str, char[] cArr, int i11, int i12) {
        if (str.length() != i12 - i11) {
            return false;
        }
        int i13 = 0;
        while (i11 != i12) {
            if (cArr[i11] != str.charAt(i13)) {
                return false;
            }
            i11++;
            i13++;
        }
        return true;
    }

    public char[] getBuffer() {
        return this.buffer;
    }

    public int getLineBegin() {
        return this.lineBegin;
    }

    public int getLineEnd() {
        return this.lineEnd;
    }

    public int getLineNumber() {
        return this.lineNumber;
    }

    public boolean nextLine() {
        int i11;
        int i12;
        int i13 = this.nextLineStart;
        char c11 = 0;
        if (i13 == this.bufferEnd) {
            this.lineNumber = 0;
            return false;
        }
        while (true) {
            i11 = this.bufferEnd;
            if (i13 == i11 || (c11 = this.buffer[i13]) == '\n' || c11 == '\r') {
                break;
            }
            i13++;
        }
        this.lineBegin = this.nextLineStart;
        this.lineEnd = i13;
        if (i13 == i11) {
            this.nextLineStart = i13;
        } else if (c11 == '\r' && (i12 = i13 + 1) != i11 && this.buffer[i12] == '\n') {
            this.nextLineStart = i13 + 2;
        } else {
            this.nextLineStart = i13 + 1;
        }
        this.lineNumber++;
        return true;
    }

    public void readData(Reader reader) throws IOException {
        int length = this.buffer.length;
        int i11 = 0;
        while (true) {
            int read = reader.read(this.buffer, i11, length - i11);
            if (read < 0) {
                this.bufferEnd = i11;
                return;
            }
            i11 += read;
            if (length == i11) {
                length *= 2;
                char[] cArr = new char[length];
                System.arraycopy(this.buffer, 0, cArr, 0, i11);
                this.buffer = cArr;
            }
        }
    }

    public boolean setReplacement(int i11, int i12, String str) {
        if (equals(str, this.buffer, i11, i12)) {
            return false;
        }
        ReplaceItem replaceItem = new ReplaceItem(i11, i12, str);
        ReplaceItem replaceItem2 = this.firstReplace;
        if (replaceItem2 == null) {
            this.lastReplace = replaceItem;
            this.firstReplace = replaceItem;
            return true;
        }
        if (i11 < replaceItem2.begin) {
            replaceItem.next = replaceItem2;
            this.firstReplace = replaceItem;
            return true;
        }
        ReplaceItem replaceItem3 = replaceItem2.next;
        while (true) {
            ReplaceItem replaceItem4 = replaceItem3;
            ReplaceItem replaceItem5 = replaceItem2;
            replaceItem2 = replaceItem4;
            if (replaceItem2 == null) {
                break;
            }
            if (i11 < replaceItem2.begin) {
                replaceItem.next = replaceItem2;
                replaceItem5.next = replaceItem;
                break;
            }
            replaceItem3 = replaceItem2.next;
        }
        if (replaceItem2 != null) {
            return true;
        }
        this.lastReplace.next = replaceItem;
        return true;
    }

    public void startLineLoop() {
        this.lineNumber = 0;
        this.nextLineStart = 0;
        this.lineEnd = 0;
        this.lineBegin = 0;
    }

    public boolean wasModified() {
        return this.firstReplace != null;
    }

    public void writeData(Writer writer) throws IOException {
        int i11 = 0;
        for (ReplaceItem replaceItem = this.firstReplace; replaceItem != null; replaceItem = replaceItem.next) {
            int i12 = replaceItem.begin - i11;
            if (i12 > 0) {
                writer.write(this.buffer, i11, i12);
            }
            writer.write(replaceItem.replacement);
            i11 = replaceItem.end;
        }
        int i13 = this.bufferEnd - i11;
        if (i13 != 0) {
            writer.write(this.buffer, i11, i13);
        }
    }

    public void writeInitialData(Writer writer) throws IOException {
        writer.write(this.buffer, 0, this.bufferEnd);
    }
}
