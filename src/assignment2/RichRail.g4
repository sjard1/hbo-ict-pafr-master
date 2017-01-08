grammar RichRail;

options {
    language = Java;
}

@members {
    public assignment2.domain.CommandHandler handler = new assignment2.domain.RailCompany();
}

command : newcommand | addcommand | getcommand | delcommand | remcommand;

newcommand : newtraincommand | newwagoncommand;
newtraincommand : 'new' ' ' 'train' ' ' ID {handler.newTrainCommand($ID.text);};
newwagoncommand : 'new' ' ' 'wagon' ' ' ID (' ' 'numseats' ' ' seats=INT)? {handler.newWagonCommand($ID.text, $seats.text);};
delcommand : 'delete' ' ' type ' ' ID {handler.delCommand($type.text, $ID.text);};

addcommand : 'add' ' ' wagon=ID ' ' 'to' ' ' train=ID {handler.addCommand($wagon.text, $train.text);};
remcommand : 'remove' ' ' wagon=ID 'from' ' ' train=ID {handler.remCommand($wagon.text, $train.text);};

getcommand : 'getnumseats' ' ' type ' ' ID {handler.getCommand($type.text, $ID.text);};

type : ('train') | ('wagon');

ID : [a-z][a-z|0-9]*;
INT : [0-9]+;
WS : [ \t\r\n]+ -> skip;