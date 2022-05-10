        winningConditions.add(vertical1);
        winningConditions.add(vertical2);

        for(List l: winningConditions){
            if(playerPositions.containsAll(l)){
                return "Congratulations you won!";
            } else if(cpuPositions.containsAll(l)){
                return "Better luck next time. CPU Wins.";
            } else if(playerPositions.size() + cpuPositions.size() == 9){
                return "CAT";
            }
        }


        return "";
    }
}