import java.awt.*;
import javax.swing.*;

public class Assignment2_60050239 extends JPanel{
    private Graphics g;

    /// Define Color
    private Color BG = new Color(233,232,231);
    private Color BROWN = new Color(114,100,91);
    private Color SHADOW = new Color(214,212,211);
    //////////////////

    /// shadow offset
    private int y_offset = 5;

    public static void main(String[] args) {
        Assignment2_60050239 m = new Assignment2_60050239();

        JFrame f=new JFrame();
        f.add(m);
        f.setTitle("Assignment2_60050239");
        f.setSize(615,645);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void paintComponent(Graphics g){
        this.g = g;
        draw_bg();
        draw_circle(300,300,140,BROWN);
        draw_circle(300,300,128,BROWN);
        draw_shadow();
        draw_deer();
    }

    public void draw_shadow(){
        draw_triangle(461, 153+y_offset, 469, 144+y_offset, 467, 70+y_offset, SHADOW);
        draw_triangle(459, 162+y_offset, 465, 169+y_offset, 467, 151+y_offset, SHADOW);
        draw_triangle(459, 162+y_offset, 465, 169+y_offset, 459, 182+y_offset, SHADOW);
        draw_triangle(456, 170+y_offset, 454, 193+y_offset, 442, 218+y_offset, SHADOW);
        draw_triangle(442, 218+y_offset, 434, 208+y_offset, 456, 170+y_offset, SHADOW);
        draw_triangle(441, 219+y_offset, 433, 209+y_offset, 397, 219+y_offset, SHADOW);
        draw_triangle(430, 206+y_offset, 404, 212+y_offset, 422, 194+y_offset, SHADOW);
        draw_triangle(432, 204+y_offset, 439, 194+y_offset, 406, 161+y_offset, SHADOW);
        draw_triangle(427, 176+y_offset, 435, 184+y_offset, 448, 149+y_offset, SHADOW);
        draw_triangle(438, 155+y_offset, 452, 140+y_offset, 450, 116+y_offset, SHADOW);
        draw_triangle(440, 138+y_offset, 452, 106+y_offset, 443, 72+y_offset, SHADOW);
        draw_triangle(408, 172+y_offset, 395, 148+y_offset, 367, 134+y_offset, SHADOW);
        draw_triangle(428, 224+y_offset, 384, 224+y_offset, 372, 239+y_offset, SHADOW);
        draw_triangle(382, 224+y_offset, 369, 240+y_offset, 348, 234+y_offset, SHADOW);
        draw_triangle(369, 241+y_offset, 346, 235+y_offset, 348, 260+y_offset, SHADOW);
        draw_triangle(353, 227+y_offset, 346, 223+y_offset, 346, 230+y_offset, SHADOW);
        draw_triangle(356, 227+y_offset, 345, 220+y_offset, 358, 181+y_offset, SHADOW);
        draw_triangle(360, 176+y_offset, 367, 178+y_offset, 359 ,219+y_offset, SHADOW);
        draw_triangle(360, 172+y_offset, 367, 173+y_offset, 357, 152+y_offset, SHADOW);
        draw_triangle(344, 271+y_offset, 341, 227+y_offset, 321, 263+y_offset, SHADOW);
        draw_triangle(342, 274+y_offset, 323, 268+y_offset, 331, 280+y_offset, SHADOW);
        draw_triangle(327, 283+y_offset, 319, 268+y_offset, 312, 296+y_offset, SHADOW);
        draw_triangle(317, 268+y_offset, 307, 268+y_offset, 311, 294+y_offset, SHADOW);
        draw_triangle(329, 287+y_offset, 336, 298+y_offset, 316, 298+y_offset, SHADOW);
        draw_triangle(344, 278+y_offset, 332, 285+y_offset, 342, 302+y_offset, SHADOW);
        draw_triangle(324, 304+y_offset, 314, 304+y_offset, 320, 308+y_offset, SHADOW);
        draw_triangle(336, 304+y_offset, 323, 310+y_offset, 331, 318+y_offset, SHADOW);
        draw_triangle(338, 303+y_offset, 333, 317+y_offset, 341, 309+y_offset, SHADOW);
        draw_triangle(343, 313+y_offset, 343, 330+y_offset, 334, 321+y_offset, SHADOW);
        draw_triangle(329, 322+y_offset, 318, 349+y_offset, 311, 305+y_offset, SHADOW);
        draw_triangle(342, 335+y_offset, 332, 324+y_offset, 322, 354+y_offset, SHADOW);
        draw_triangle(341, 338+y_offset, 320, 356+y_offset, 329, 365+y_offset, SHADOW);
        draw_triangle(341, 341+y_offset, 330, 364+y_offset, 340, 358+y_offset, SHADOW);
        draw_triangle(320, 362+y_offset, 320, 375+y_offset, 326, 368+y_offset, SHADOW);
        draw_triangle(340, 363+y_offset, 330, 370+y_offset, 347, 422+y_offset, SHADOW);
        draw_triangle(347, 433+y_offset, 319, 380+y_offset, 327, 372+y_offset, SHADOW);
        draw_triangle(310, 318+y_offset, 308, 354+y_offset, 315, 354+y_offset, SHADOW);
        draw_triangle(315, 359+y_offset, 311, 363+y_offset, 309, 357+y_offset, SHADOW);
        draw_triangle(316, 369+y_offset, 310, 366+y_offset, 316, 361+y_offset, SHADOW);
        draw_triangle(315, 371+y_offset, 315, 377+y_offset, 310, 371+y_offset, SHADOW);
        draw_triangle(314, 378+y_offset, 309, 374+y_offset, 303, 382+y_offset, SHADOW);
        draw_triangle(305, 358+y_offset, 302, 360+y_offset, 307, 366+y_offset, SHADOW);
        draw_triangle(308, 370+y_offset, 302, 361+y_offset, 302, 382+y_offset, SHADOW);
        draw_triangle(315, 381+y_offset, 301, 387+y_offset, 306, 391+y_offset, SHADOW);
        draw_triangle(304, 391+y_offset, 300, 388+y_offset, 300, 391+y_offset, SHADOW);
        draw_triangle(315, 385+y_offset, 308, 393+y_offset, 315, 491+y_offset, SHADOW);
        draw_triangle(308, 393+y_offset, 301, 393+y_offset, 315, 491+y_offset, SHADOW);
        draw_triangle(316, 494+y_offset, 321, 493+y_offset, 317, 384+y_offset, SHADOW);
        draw_triangle(320, 387+y_offset, 324, 491+y_offset, 343, 471+y_offset, SHADOW);
        draw_triangle(341, 464+y_offset, 352, 451+y_offset, 320, 387+y_offset, SHADOW);
        draw_triangle(346, 318+y_offset, 360, 309+y_offset, 349, 289+y_offset, SHADOW);
        draw_triangle(358, 297+y_offset, 366, 285+y_offset, 353, 290+y_offset, SHADOW);
        draw_triangle(360, 300+y_offset, 400, 305+y_offset, 372, 284+y_offset, SHADOW);
        draw_triangle(360, 300+y_offset, 398, 307+y_offset, 364, 309+y_offset, SHADOW);
        draw_triangle(374, 283+y_offset, 419, 266+y_offset, 401, 305+y_offset, SHADOW);
        draw_triangle(350, 284+y_offset, 381, 265+y_offset, 386, 273+y_offset, SHADOW);
        draw_triangle(386, 273+y_offset, 381, 265+y_offset, 411, 265+y_offset, SHADOW);

        draw_triangle(300, 270+y_offset,300,336+y_offset,307,279+y_offset,SHADOW);
        draw_triangle(307, 279+y_offset,300,336+y_offset,304,348+y_offset,SHADOW);
        draw_triangle(304, 353+y_offset,295,353+y_offset,300,339+y_offset,SHADOW);
        draw_triangle(292, 279+y_offset,300,270+y_offset,300,336+y_offset,SHADOW);
        draw_triangle(300, 336+y_offset,292,279+y_offset,295,348+y_offset,SHADOW);
        draw_triangle(292, 268+y_offset,288,294+y_offset,281,267+y_offset,SHADOW);
        draw_triangle(280, 268+y_offset,272,283+y_offset,287,296+y_offset,SHADOW);
        draw_triangle(277, 268+y_offset,255,274+y_offset,270,281+y_offset,SHADOW);
        draw_triangle(278, 263+y_offset,258,227+y_offset,254,271+y_offset,SHADOW);
        draw_triangle(254, 222+y_offset,244,228+y_offset,254,230+y_offset,SHADOW);
        draw_triangle(243, 227+y_offset,254,220+y_offset,241,180+y_offset,SHADOW);
        draw_triangle(239, 176+y_offset,232,178+y_offset,241,224+y_offset,SHADOW);
        draw_triangle(240, 172+y_offset,242,152+y_offset,232,173+y_offset,SHADOW);
        draw_triangle(254, 234+y_offset,230,241+y_offset,252,260+y_offset,SHADOW);
        draw_triangle(251, 234+y_offset,229,240+y_offset,216,223+y_offset,SHADOW);
        draw_triangle(215, 223+y_offset,170,223+y_offset,227,240+y_offset,SHADOW);
        draw_triangle(203, 219+y_offset,166,209+y_offset,158,219+y_offset,SHADOW);
        draw_triangle(157, 218+y_offset,165,207+y_offset,143,169+y_offset,SHADOW);
        draw_triangle(157, 218+y_offset,144,191+y_offset,143,169+y_offset,SHADOW);
        draw_triangle(169, 206+y_offset,196,213+y_offset,178,194+y_offset,SHADOW);
        draw_triangle(167, 205+y_offset,160,194+y_offset,194,159+y_offset,SHADOW);
        draw_triangle(190, 173+y_offset,203,148+y_offset,233,133+y_offset,SHADOW);
        draw_triangle(164, 185+y_offset,172,176+y_offset,150,147+y_offset,SHADOW);
        draw_triangle(162, 157+y_offset,148,115+y_offset,147,140+y_offset,SHADOW);
        draw_triangle(159, 139+y_offset,147,105+y_offset,156,72+y_offset,SHADOW);
        draw_triangle(139, 161+y_offset,134,172+y_offset,141,184+y_offset,SHADOW);
        draw_triangle(134, 172+y_offset,139,161+y_offset,132,151+y_offset,SHADOW);
        draw_triangle(138, 153+y_offset,130,144+y_offset,132,70+y_offset,SHADOW);
        draw_triangle(257, 303+y_offset,254,277+y_offset,268,284+y_offset,SHADOW);
        draw_triangle(263, 299+y_offset,285,299+y_offset,270,286+y_offset,SHADOW);
        draw_triangle(286, 304+y_offset,276,304+y_offset,279,308+y_offset,SHADOW);
        draw_triangle(268, 318+y_offset,277,310+y_offset,261,302+y_offset,SHADOW);
        draw_triangle(266, 317+y_offset,257,308+y_offset,261,304+y_offset,SHADOW);
        draw_triangle(281, 349+y_offset,288,305+y_offset,270,321+y_offset,SHADOW);
        draw_triangle(256, 330+y_offset,265,320+y_offset,256,312+y_offset,SHADOW);
        draw_triangle(279, 355+y_offset,268,323+y_offset,257,335+y_offset,SHADOW);
        draw_triangle(284, 355+y_offset,291,355+y_offset,289,316+y_offset,SHADOW);
        draw_triangle(271, 365+y_offset,279,356+y_offset,257,337+y_offset,SHADOW);
        draw_triangle(258, 358+y_offset,270,365+y_offset,257,338+y_offset,SHADOW);
        draw_triangle(288, 363+y_offset,290,357+y_offset,284,359+y_offset,SHADOW);
        draw_triangle(292, 366+y_offset,298,359+y_offset,294,358+y_offset,SHADOW);
        draw_triangle(288, 367+y_offset,283,367+y_offset,283,361+y_offset,SHADOW);
        draw_triangle(299, 359+y_offset,291,370+y_offset,298,382+y_offset,SHADOW);
        draw_triangle(296, 382+y_offset,290,373+y_offset,285,378+y_offset,SHADOW);
        draw_triangle(289, 371+y_offset,284,371+y_offset,284,377+y_offset,SHADOW);
        draw_triangle(285, 382+y_offset,294,391+y_offset,298,386+y_offset,SHADOW);
        draw_triangle(300, 391+y_offset,300,387+y_offset,295,391+y_offset,SHADOW);
        draw_triangle(279, 374+y_offset,279,362+y_offset,273,368+y_offset,SHADOW);
        draw_triangle(280, 380+y_offset,272,371+y_offset,251,435+y_offset,SHADOW);
        draw_triangle(251, 425+y_offset,269,370+y_offset,259,363+y_offset,SHADOW);
        draw_triangle(299, 395+y_offset,299,509+y_offset,287,499+y_offset,SHADOW);
        draw_triangle(299, 395+y_offset,299,509+y_offset,312,499+y_offset,SHADOW);
        draw_triangle(297, 393+y_offset,292,393+y_offset,283,495+y_offset,SHADOW);
        draw_triangle(292, 393+y_offset,284,490+y_offset,284,385+y_offset,SHADOW);
        draw_triangle(282, 385+y_offset,276,493+y_offset,282,495+y_offset,SHADOW);
        draw_triangle(279, 387+y_offset,274,491+y_offset,256,472+y_offset,SHADOW);
        draw_triangle(279, 387+y_offset,259,465+y_offset,247,450+y_offset,SHADOW);
        draw_triangle(253, 317+y_offset,250,288+y_offset,238,309+y_offset,SHADOW);
        draw_triangle(241, 297+y_offset,246,290+y_offset,233,285+y_offset,SHADOW);
        draw_triangle(239, 300+y_offset,227,284+y_offset,200,305+y_offset,SHADOW);
        draw_triangle(239, 300+y_offset,201,306+y_offset,235,309+y_offset,SHADOW);
        draw_triangle(199, 305+y_offset,225,283+y_offset,180,266+y_offset,SHADOW);
        draw_triangle(248, 284+y_offset,217,265+y_offset,187,265+y_offset,SHADOW);
    }

    public void draw_deer(){
        draw_triangle(461, 153, 469, 144, 467, 70, BROWN);
        draw_triangle(459, 162, 465, 169, 467, 151, BROWN);
        draw_triangle(459, 162, 465, 169, 459, 182, BROWN);
        draw_triangle(456, 170, 454, 193, 442, 218, BROWN);
        draw_triangle(442, 218, 434, 208, 456, 170, BROWN);
        draw_triangle(441, 219, 433, 209, 397, 219, BROWN);
        draw_triangle(430, 206, 404, 212, 422, 194, BROWN);
        draw_triangle(432, 204, 439, 194, 406, 161, BROWN);
        draw_triangle(427, 176, 435, 184, 448, 149, BROWN);
        draw_triangle(438, 155, 452, 140, 450, 116, BROWN);
        draw_triangle(440, 138, 452, 106, 443, 72, BROWN);
        draw_triangle(408, 172, 395, 148, 367, 134, BROWN);
        draw_triangle(428, 224, 384, 224, 372, 239, BROWN);
        draw_triangle(382, 224, 369, 240, 348, 234, BROWN);
        draw_triangle(369, 241, 346, 235, 348, 260, BROWN);
        draw_triangle(353, 227, 346, 223, 346, 230, BROWN);
        draw_triangle(356, 227, 345, 220, 358, 181, BROWN);
        draw_triangle(360, 176, 367, 178, 359 ,219, BROWN);
        draw_triangle(360, 172, 367, 173, 357, 152, BROWN);
        draw_triangle(344, 271, 341, 227, 321, 263, BROWN);
        draw_triangle(342, 274, 323, 268, 331, 280, BROWN);
        draw_triangle(327, 283, 319, 268, 312, 296, BROWN);
        draw_triangle(317, 268, 307, 268, 311, 294, BROWN);
        draw_triangle(329, 287, 336, 298, 316, 298, BROWN);
        draw_triangle(344, 278, 332, 285, 342, 302, BROWN);
        draw_triangle(324, 304, 314, 304, 320, 308, BROWN);
        draw_triangle(336, 304, 323, 310, 331, 318, BROWN);
        draw_triangle(338, 303, 333, 317, 341, 309, BROWN);
        draw_triangle(343, 313, 343, 330, 334, 321, BROWN);
        draw_triangle(329, 322, 318, 349, 311, 305, BROWN);
        draw_triangle(342, 335, 332, 324, 322, 354, BROWN);
        draw_triangle(341, 338, 320, 356, 329, 365, BROWN);
        draw_triangle(341, 341, 330, 364, 340, 358, BROWN);
        draw_triangle(320, 362, 320, 375, 326, 368, BROWN);
        draw_triangle(340, 363, 330, 370, 347, 422, BROWN);
        draw_triangle(347, 433, 319, 380, 327, 372, BROWN);
        draw_triangle(310, 318, 308, 354, 315, 354, BROWN);
        draw_triangle(315, 359, 311, 363, 309, 357, BROWN);
        draw_triangle(316, 369, 310, 366, 316, 361, BROWN);
        draw_triangle(315, 371, 315, 377, 310, 371, BROWN);
        draw_triangle(314, 378, 309, 374, 303, 382, BROWN);
        draw_triangle(305, 358, 302, 360, 307, 366, BROWN);
        draw_triangle(308, 370, 302, 361, 302, 382, BROWN);
        draw_triangle(315, 381, 301, 387, 306, 391, BROWN);
        draw_triangle(304, 391, 300, 388, 300, 391, BROWN);
        draw_triangle(315, 385, 308, 393, 315, 491, BROWN);
        draw_triangle(308, 393, 301, 393, 315, 491, BROWN);
        draw_triangle(316, 494, 321, 493, 317, 384, BROWN);
        draw_triangle(320, 387, 324, 491, 343, 471, BROWN);
        draw_triangle(341, 464, 352, 451, 320, 387, BROWN);
        draw_triangle(346, 318, 360, 309, 349, 289, BROWN);
        draw_triangle(358, 297, 366, 285, 353, 290, BROWN);
        draw_triangle(360, 300, 400, 305, 372, 284, BROWN);
        draw_triangle(360, 300, 398, 307, 364, 309, BROWN);
        draw_triangle(374, 283, 419, 266, 401, 305, BROWN);
        draw_triangle(350, 284, 381, 265, 386, 273, BROWN);
        draw_triangle(386, 273, 381, 265, 411, 265, BROWN);

        draw_triangle(300, 270, 300, 336, 307, 279, BROWN);
        draw_triangle(307, 279, 300, 336, 304, 348, BROWN);
        draw_triangle(304, 353, 295, 353, 300, 339, BROWN);
        draw_triangle(292, 279, 300, 270, 300, 336, BROWN);
        draw_triangle(300, 336, 292, 279, 295, 348, BROWN);
        draw_triangle(292, 268, 288, 294, 281, 267, BROWN);
        draw_triangle(280, 268, 272, 283, 287, 296, BROWN);
        draw_triangle(277, 268, 255, 274, 270, 281, BROWN);
        draw_triangle(278, 263, 258, 227, 254, 271, BROWN);
        draw_triangle(254, 222, 244, 228, 254, 230, BROWN);
        draw_triangle(243, 227, 254, 220, 241, 180, BROWN);
        draw_triangle(239, 176, 232, 178, 241, 224, BROWN);
        draw_triangle(240, 172, 242, 152, 232, 173, BROWN);
        draw_triangle(254, 234, 230, 241, 252, 260, BROWN);
        draw_triangle(251, 234, 229, 240, 216, 223, BROWN);
        draw_triangle(215, 223, 170, 223, 227, 240, BROWN);
        draw_triangle(203, 219, 166, 209, 158, 219, BROWN);
        draw_triangle(157, 218, 165, 207, 143, 169, BROWN);
        draw_triangle(157, 218, 144, 191, 143, 169, BROWN);
        draw_triangle(169, 206, 196, 213, 178, 194, BROWN);
        draw_triangle(167, 205, 160, 194, 194, 159, BROWN);
        draw_triangle(190, 173, 203, 148, 233, 133, BROWN);
        draw_triangle(164, 185, 172, 176, 150, 147, BROWN);
        draw_triangle(162, 157, 148, 115, 147, 140, BROWN);
        draw_triangle(159, 139, 147, 105, 156, 72,  BROWN);
        draw_triangle(139, 161, 134, 172, 141, 184, BROWN);
        draw_triangle(134, 172, 139, 161, 132, 151, BROWN);
        draw_triangle(138, 153, 130, 144, 132, 70,  BROWN);
        draw_triangle(257, 303, 254, 277, 268, 284, BROWN);
        draw_triangle(263, 299, 285, 299, 270, 286, BROWN);
        draw_triangle(286, 304, 276, 304, 279, 308, BROWN);
        draw_triangle(268, 318, 277, 310, 261, 302, BROWN);
        draw_triangle(266, 317, 257, 308, 261, 304, BROWN);
        draw_triangle(281, 349, 288, 305, 270, 321, BROWN);
        draw_triangle(256, 330, 265, 320, 256, 312, BROWN);
        draw_triangle(279, 355, 268, 323, 257, 335, BROWN);
        draw_triangle(284, 355, 291, 355, 289, 316, BROWN);
        draw_triangle(271, 365, 279, 356, 257, 337, BROWN);
        draw_triangle(258, 358, 270, 365, 257, 338, BROWN);
        draw_triangle(288, 363, 290, 357, 284, 359, BROWN);
        draw_triangle(292, 366, 298, 359, 294, 358, BROWN);
        draw_triangle(288, 367, 283, 367, 283, 361, BROWN);
        draw_triangle(299, 359, 291, 370, 298, 382, BROWN);
        draw_triangle(296, 382, 290, 373, 285, 378, BROWN);
        draw_triangle(289, 371, 284, 371, 284, 377, BROWN);
        draw_triangle(285, 382, 294, 391, 298, 386, BROWN);
        draw_triangle(300, 391, 300, 387, 295, 391, BROWN);
        draw_triangle(279, 374, 279, 362, 273, 368, BROWN);
        draw_triangle(280, 380, 272, 371, 251, 435, BROWN);
        draw_triangle(251, 425, 269, 370, 259, 363, BROWN);
        draw_triangle(299, 395, 299, 509, 287, 499, BROWN);
        draw_triangle(299, 395, 299, 509, 312, 499, BROWN);
        draw_triangle(297, 393, 292, 393, 283, 495, BROWN);
        draw_triangle(292, 393, 284, 490, 284, 385, BROWN);
        draw_triangle(282, 385, 276, 493, 282, 495, BROWN);
        draw_triangle(279, 387, 274, 491, 256, 472, BROWN);
        draw_triangle(279, 387, 259, 465, 247, 450, BROWN);
        draw_triangle(253, 317, 250, 288, 238, 309, BROWN);
        draw_triangle(241, 297, 246, 290, 233, 285, BROWN);
        draw_triangle(239, 300, 227, 284, 200, 305, BROWN);
        draw_triangle(239, 300, 201, 306, 235, 309, BROWN);
        draw_triangle(199, 305, 225, 283, 180, 266, BROWN);
        draw_triangle(248, 284, 217, 265, 187, 265, BROWN);




    }

    public void draw_bg(){
        this.draw_triangle(0, 0, 599, 0, 0, 599, BG);
        this.draw_triangle(599, 599, 599, 0, 0, 599, BG);
    }

    private void draw_triangle(int x1,int y1,int x2,int y2,int x3,int y3,Color c){ //polygon
        this.g.setColor(c);
        int[] x = {x1,x2,x3};
        int[] y = {y1,y2,y3};
        int n = 3;
        Polygon p = new Polygon(x, y, n);

        this.g.fillPolygon(p);
    }

    private void draw_circle(int xcenter,int ycenter,int r,Color c){ //midpoint algorithm
        this.g.setColor(c);
        int x=0;
        int y=r;
        int p=1-r;
        CirclePlotpoint(xcenter,ycenter,x,y);
        while(x<y){
            x++;
            if(p<0){
                p+=2*x+1;
            }
            else{
                y--;
                p+=2*(x-y)+1;
            }
            CirclePlotpoint(xcenter,ycenter,x,y);
        }

    }
    public void CirclePlotpoint(int xcenter,int ycenter,int x,int y){
        setPixel(xcenter+x,ycenter+y);
        setPixel(xcenter-x,ycenter+y);
        setPixel(xcenter+x,ycenter-y);
        setPixel(xcenter-x,ycenter-y);
        setPixel(xcenter+y,ycenter+x);
        setPixel(xcenter-y,ycenter+x);
        setPixel(xcenter+y,ycenter-x);
        setPixel(xcenter-y,ycenter-x);
    }
    public void setPixel(int x,int y){
        this.g.drawOval(x,y,1,1);
    }



}