package org.mozilla.javascript.tools.shell;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Segment;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class ConsoleTextArea extends JTextArea implements KeyListener, DocumentListener {
    static final long serialVersionUID = 8557083244830872961L;

    /* renamed from: in, reason: collision with root package name */
    private PipedInputStream f78411in;
    private PrintWriter inPipe;
    private int historyIndex = -1;
    private int outputMark = 0;
    private List<String> history = new ArrayList();
    private ConsoleWriter console1 = new ConsoleWriter(this);
    private ConsoleWriter console2 = new ConsoleWriter(this);
    private PrintStream out = new PrintStream((OutputStream) this.console1, true);
    private PrintStream err = new PrintStream((OutputStream) this.console2, true);

    public ConsoleTextArea(String[] strArr) {
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        this.inPipe = new PrintWriter(pipedOutputStream);
        PipedInputStream pipedInputStream = new PipedInputStream();
        this.f78411in = pipedInputStream;
        try {
            pipedOutputStream.connect(pipedInputStream);
        } catch (IOException e11) {
            e11.printStackTrace();
        }
        getDocument().addDocumentListener(this);
        addKeyListener(this);
        setLineWrap(true);
        setFont(new Font("Monospaced", 0, 12));
    }

    public synchronized void changedUpdate(DocumentEvent documentEvent) {
    }

    public void eval(String str) {
        this.inPipe.write(str);
        this.inPipe.write("\n");
        this.inPipe.flush();
        this.console1.flush();
    }

    public PrintStream getErr() {
        return this.err;
    }

    public InputStream getIn() {
        return this.f78411in;
    }

    public PrintStream getOut() {
        return this.out;
    }

    public synchronized void insertUpdate(DocumentEvent documentEvent) {
        int length = documentEvent.getLength();
        int offset = documentEvent.getOffset();
        int i11 = this.outputMark;
        if (i11 > offset) {
            this.outputMark = i11 + length;
        }
    }

    public void keyPressed(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 8 || keyCode == 37) {
            if (this.outputMark == getCaretPosition()) {
                keyEvent.consume();
                return;
            }
            return;
        }
        if (keyCode == 36) {
            int caretPosition = getCaretPosition();
            int i11 = this.outputMark;
            if (caretPosition == i11) {
                keyEvent.consume();
                return;
            }
            if (caretPosition <= i11 || keyEvent.isControlDown()) {
                return;
            }
            if (keyEvent.isShiftDown()) {
                moveCaretPosition(this.outputMark);
            } else {
                setCaretPosition(this.outputMark);
            }
            keyEvent.consume();
            return;
        }
        if (keyCode == 10) {
            returnPressed();
            keyEvent.consume();
            return;
        }
        if (keyCode == 38) {
            int i12 = this.historyIndex;
            int i13 = i12 - 1;
            this.historyIndex = i13;
            if (i13 >= 0) {
                if (i13 >= this.history.size()) {
                    this.historyIndex = this.history.size() - 1;
                }
                int i14 = this.historyIndex;
                if (i14 >= 0) {
                    String str = this.history.get(i14);
                    replaceRange(str, this.outputMark, getDocument().getLength());
                    int length = this.outputMark + str.length();
                    select(length, length);
                } else {
                    this.historyIndex = i14 + 1;
                }
            } else {
                this.historyIndex = i12;
            }
            keyEvent.consume();
            return;
        }
        if (keyCode == 40) {
            int i15 = this.outputMark;
            if (this.history.size() > 0) {
                int i16 = this.historyIndex + 1;
                this.historyIndex = i16;
                if (i16 < 0) {
                    this.historyIndex = 0;
                }
                int length2 = getDocument().getLength();
                if (this.historyIndex < this.history.size()) {
                    String str2 = this.history.get(this.historyIndex);
                    replaceRange(str2, this.outputMark, length2);
                    i15 = str2.length() + this.outputMark;
                } else {
                    this.historyIndex = this.history.size();
                    replaceRange("", this.outputMark, length2);
                }
            }
            select(i15, i15);
            keyEvent.consume();
        }
    }

    public synchronized void keyReleased(KeyEvent keyEvent) {
    }

    public void keyTyped(KeyEvent keyEvent) {
        if (keyEvent.getKeyChar() == '\b') {
            if (this.outputMark == getCaretPosition()) {
                keyEvent.consume();
            }
        } else {
            int caretPosition = getCaretPosition();
            int i11 = this.outputMark;
            if (caretPosition < i11) {
                setCaretPosition(i11);
            }
        }
    }

    public synchronized void postUpdateUI() {
        requestFocus();
        setCaret(getCaret());
        int i11 = this.outputMark;
        select(i11, i11);
    }

    public synchronized void removeUpdate(DocumentEvent documentEvent) {
        try {
            int length = documentEvent.getLength();
            int offset = documentEvent.getOffset();
            int i11 = this.outputMark;
            if (i11 > offset) {
                if (i11 >= offset + length) {
                    this.outputMark = i11 - length;
                } else {
                    this.outputMark = offset;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void returnPressed() {
        Document document = getDocument();
        int length = document.getLength();
        Segment segment = new Segment();
        try {
            int i11 = this.outputMark;
            document.getText(i11, length - i11, segment);
        } catch (BadLocationException e11) {
            e11.printStackTrace();
        }
        if (segment.count > 0) {
            this.history.add(segment.toString());
        }
        this.historyIndex = this.history.size();
        this.inPipe.write(segment.array, segment.offset, segment.count);
        append("\n");
        this.outputMark = document.getLength();
        this.inPipe.write("\n");
        this.inPipe.flush();
        this.console1.flush();
    }

    public void select(int i11, int i12) {
        requestFocus();
        super.select(i11, i12);
    }

    public synchronized void write(String str) {
        insert(str, this.outputMark);
        int length = this.outputMark + str.length();
        this.outputMark = length;
        select(length, length);
    }
}
