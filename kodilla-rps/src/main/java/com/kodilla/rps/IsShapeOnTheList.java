package com.kodilla.rps;

import java.util.List;

    public class IsShapeOnTheList {

        private List<String> theList;
        private String shapeName;

        public IsShapeOnTheList(List<String> theList, String shapeName) {
            this.theList = theList;
            this.shapeName = shapeName;
        }

        public boolean checkShapesList()
        {
            if (theList.contains(shapeName)) {
                return true;
            }
            return false;
        }
    }

