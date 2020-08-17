package Shapes;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Rectangle {
    private int width;
    private int height;

    public double getArea() {
        return this.getWidth() * this.getHeight();
    }
}
