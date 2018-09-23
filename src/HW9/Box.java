package HW9;

import java.util.ArrayList;

public class  Box <T extends Tea> {

    private ArrayList <T> boxPlace = new ArrayList<>();


    public void putTarget (T t ){
        boxPlace.add(t);
    }

    public T getTarget (T t ){

        for (int i = 0; i <boxPlace.size() ; i++) {
            if (t.equals(boxPlace.get(i))){
                return boxPlace.get(i);
            }
        }
        return null;
    }





    public ArrayList <T> getBoxPlace() {
        return boxPlace;
    }

    private void setBoxPlace(ArrayList <T> boxPlace) {
        this.boxPlace = boxPlace;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Box<?> box = (Box<?>) o;

        return boxPlace != null ? boxPlace.equals(box.boxPlace) : box.boxPlace == null;
    }

    @Override
    public int hashCode() {
        return boxPlace != null ? boxPlace.hashCode() : 0;
    }
}
