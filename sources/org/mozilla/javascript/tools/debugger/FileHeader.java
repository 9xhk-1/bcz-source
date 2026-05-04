package org.mozilla.javascript.tools.debugger;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import javax.swing.text.BadLocationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class FileHeader extends JPanel implements MouseListener {
    private static final long serialVersionUID = -2858905404778259127L;
    private FileWindow fileWindow;
    private int pressLine = -1;

    public FileHeader(FileWindow fileWindow) {
        this.fileWindow = fileWindow;
        addMouseListener(this);
        update();
    }

    public void mousePressed(MouseEvent mouseEvent) {
        this.pressLine = mouseEvent.getY() / getFontMetrics(this.fileWindow.textArea.getFont()).getHeight();
    }

    public void mouseReleased(MouseEvent mouseEvent) {
        if (mouseEvent.getComponent() != this || (mouseEvent.getModifiers() & 16) == 0) {
            return;
        }
        int y11 = mouseEvent.getY() / getFontMetrics(this.fileWindow.textArea.getFont()).getHeight();
        if (y11 == this.pressLine) {
            this.fileWindow.toggleBreakPoint(y11 + 1);
        } else {
            this.pressLine = -1;
        }
    }

    public void paint(Graphics graphics) {
        int i11;
        super.paint(graphics);
        FileTextArea fileTextArea = this.fileWindow.textArea;
        Font font = fileTextArea.getFont();
        graphics.setFont(font);
        FontMetrics fontMetrics = getFontMetrics(font);
        Rectangle clipBounds = graphics.getClipBounds();
        graphics.setColor(getBackground());
        graphics.fillRect(clipBounds.x, clipBounds.y, clipBounds.width, clipBounds.height);
        int maxAscent = fontMetrics.getMaxAscent();
        int height = fontMetrics.getHeight();
        int lineCount = fileTextArea.getLineCount() + 1;
        Integer.toString(lineCount).length();
        int i12 = clipBounds.y / height;
        int i13 = ((clipBounds.y + clipBounds.height) / height) + 1;
        int width = getWidth();
        if (i13 <= lineCount) {
            lineCount = i13;
        }
        while (i12 < lineCount) {
            try {
                i11 = fileTextArea.getLineStartOffset(i12);
            } catch (BadLocationException unused) {
                i11 = -2;
            }
            int i14 = i12 + 1;
            boolean isBreakPoint = this.fileWindow.isBreakPoint(i14);
            String str = Integer.toString(i14) + " ";
            int i15 = i12 * height;
            graphics.setColor(Color.blue);
            int i16 = i15 + maxAscent;
            graphics.drawString(str, 0, i16);
            int i17 = width - maxAscent;
            if (isBreakPoint) {
                graphics.setColor(new Color(128, 0, 0));
                int i18 = i16 - 9;
                graphics.fillOval(i17, i18, 9, 9);
                graphics.drawOval(i17, i18, 8, 8);
                graphics.drawOval(i17, i18, 9, 9);
            }
            if (i11 == this.fileWindow.currentPos) {
                Polygon polygon = new Polygon();
                int i19 = i15 + (maxAscent - 10);
                int i21 = i19 + 3;
                polygon.addPoint(i17, i21);
                int i22 = i17 + 5;
                polygon.addPoint(i22, i21);
                int i23 = i19;
                int i24 = i22;
                while (i24 <= i17 + 10) {
                    polygon.addPoint(i24, i23);
                    i24++;
                    i23++;
                }
                int i25 = i17 + 9;
                while (i25 >= i22) {
                    polygon.addPoint(i25, i23);
                    i25--;
                    i23++;
                }
                int i26 = i19 + 7;
                polygon.addPoint(i22, i26);
                polygon.addPoint(i17, i26);
                graphics.setColor(Color.yellow);
                graphics.fillPolygon(polygon);
                graphics.setColor(Color.black);
                graphics.drawPolygon(polygon);
            }
            i12 = i14;
        }
    }

    public void update() {
        FileTextArea fileTextArea = this.fileWindow.textArea;
        Font font = fileTextArea.getFont();
        setFont(font);
        FontMetrics fontMetrics = getFontMetrics(font);
        int height = fontMetrics.getHeight();
        int lineCount = fileTextArea.getLineCount() + 1;
        String num = Integer.toString(lineCount);
        if (num.length() < 2) {
            num = "99";
        }
        Dimension dimension = new Dimension();
        dimension.width = fontMetrics.stringWidth(num) + 16;
        dimension.height = (lineCount * height) + 100;
        setPreferredSize(dimension);
        setSize(dimension);
    }

    public void mouseClicked(MouseEvent mouseEvent) {
    }

    public void mouseEntered(MouseEvent mouseEvent) {
    }

    public void mouseExited(MouseEvent mouseEvent) {
    }
}
