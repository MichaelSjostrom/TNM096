% Shakey World

%Shakeys actions
/*
act( goBetweenRooms(Room, Room2),
    [in(s, Room), room(Room), room(Room2), connected(Room, Room2), diff(Room, Room2)],
    [in(s, Room)],
    [in(s, Room2)]
).

%act( go(X, Y), 
%    [in(s, Room), in(X, Room), in(Y, Room), in(s, X), diff(X, Y)],
%    [in(s, X)],
%    [in(s, Y)]
%).


act( turnLightOff(SW),
    [in(s, Room), in(SW, Room), lighton(SW), on(s, Box), in(Box, Room), under(Box, SW)],
    [lighton(SW)],
    [lightoff(SW)]
).

act( climbUp(Box),
     [on(s, floor), in(s, Room), in(Box, Room)],
     [on(s, floor)],
     [on(s, Box)]
).

%act( climbDown(Box),
%     [on(s, Box)],
%     [on(s, Box)],
%     [on(s, floor)]
%).

%act( turnLightOn(SW),
%    [in(s, Room), on(s, Box) , lightoff(SW)],
%    [lightoff(SW)],
%    [lighton(SW)]
%).

%act( pushBoxBetweenRooms(Box, Room, Room2),
%    [box(Box), in(s, Room), on(s, floor), in(Box, Room), connected(Room, Room2)],
%    [in(s, Room), in(Box, Room)],
%    [in(s, Room2), in(Box, Room2)]
%).

act( pushBox(Box, X, Y),
    [box(Box), in(s, X), in(Box, X), in(SW, Y), on(s, floor), notunder(Box, SW)],
    [in(s, X), in(Box, X), notunder(Box, SW)],
    [in(s, Y), in(Box, Y), under(Box, SW)]
).

% States
% Shakey should be in room1
% Box2 should be in room2

%push box under switch
%goal_state( [under(box1, sw1)]).
% Switch of light in room1

%goal_state( [in(s, room1), lightoff(sw1)] ).

%goal_state( [in(s, room1),  in(box2, room2), lightoff(room2)] ).

%Go to room1
%goal_state( [ in(s, room1) ] ).

%Climb on Box2
%goal_state( [on(s, box2)] ).

%Turn off light in room1, without standing on a box atm
%goal_state( [in(s, room1), lightoff(sw1)] ).

%goal_state( [on(s, box1)] ).

goal_state( [lightoff(sw1)] ).

initial_state( [
        in(s, room3),
        %in(s, sw1),
        in(box2, room1),
        in(box1, room1),
        in(sw1, room1),
        in(sw2, room2),
        in(sw3, room3),
        in(sw4, room4),
        on(s, floor),
        room(room1),
        room(room2),
        room(room3),
        room(room4),
        room(korr),
        switch(sw1),
        switch(sw2),
        switch(sw3),
        switch(sw4),
        diff(sw1, sw2),
        diff(sw1, sw3),
        diff(sw1, sw4),
        diff(sw2, sw1),
        diff(sw2, sw3),
        diff(sw2, sw4),
        diff(sw3, sw1),
        diff(sw3, sw2),
        diff(sw3, sw4),
        diff(sw4, sw1),
        diff(sw4, sw2),
        diff(sw4, sw3),
        handempty,
        connected(room1, korr),
        connected(korr, room1),
        connected(room2, korr),
        connected(korr, room2),
        connected(room3, korr),
        connected(korr, room3),
        connected(room4, korr),
        box(box1),
        box(box2),
        diff(box1, box2),
        diff(box2, box1),
        notunder(box1, sw1),
        notunder(box2, sw1),
        diff(room1, room2),
        diff(room2, room3),
        diff(room3, room4),
        diff(room2, room1),
        diff(room3, room2),
        diff(room4, room3),
        diff(room1, korr),
        diff(room2, korr),
        diff(room3, korr),
        diff(room4, korr), 
        diff(korr, room1),
        diff(korr, room2),
        diff(korr, room3),
        diff(korr, room4),
        lighton(sw1),
        lightoff(sw2),
        lighton(sw3),
        lightoff(sw4)
    ]). 
*/


%This works for 1,2,3
act( goBetweenRooms(Room, Room2),
    [in(s, Room), room(Room), room(Room2), connected(Room, Room2), diff(Room, Room2)],
    [in(s, Room)],
    [in(s, Room2)]
).

act( pushBoxBetweenRooms(Box, Room, Room2),
    [box(Box), in(s, Room), on(s, floor), in(Box, Room), connected(Room, Room2)],
    [in(s, Room), in(Box, Room)],
    [in(s, Room2), in(Box, Room2)]
).

act( pushBox(Box, X, Y),
    [box(Box), in(s, X), in(Box, X), in(SW, Y), on(s, floor), notunder(Box, SW)],
    [in(s, X), in(Box, X), notunder(Box, SW)],
    [in(s, Y), in(Box, Y), under(Box, SW)]
).

act( turnLightOff(SW),
    [in(s, Room), in(SW, Room), lighton(SW), on(s, Box), in(Box, Room), under(Box, SW)],
    [lighton(SW)],
    [lightoff(SW)]
).

act( climbUp(Box),
     [on(s, floor), in(s, Room), in(Box, Room)],
     [on(s, floor)],
     [on(s, Box)]
).

%Move box to room2

goal_state( [in(s, room1)] ).

%goal_state( [lightoff(sw1)] ).

%goal_state( [ in(box1, room2 )] ).

initial_state( [
        in(s, room3),
        %in(s, sw1),
        in(box2, room1),
        in(box1, room1),
        in(sw1, room1),
        in(sw2, room2),
        in(sw3, room3),
        in(sw4, room4),
        on(s, floor),
        room(room1),
        room(room2),
        room(room3),
        room(room4),
        room(korr),
        switch(sw1),
        switch(sw2),
        switch(sw3),
        switch(sw4),
        diff(sw1, sw2),
        diff(sw1, sw3),
        diff(sw1, sw4),
        diff(sw2, sw1),
        diff(sw2, sw3),
        diff(sw2, sw4),
        diff(sw3, sw1),
        diff(sw3, sw2),
        diff(sw3, sw4),
        diff(sw4, sw1),
        diff(sw4, sw2),
        diff(sw4, sw3),
        handempty,
        connected(room1, korr),
        connected(korr, room1),
        connected(room2, korr),
        connected(korr, room2),
        connected(room3, korr),
        connected(korr, room3),
        connected(room4, korr),
        box(box1),
        box(box2),
        diff(box1, box2),
        diff(box2, box1),
        notunder(box1, sw1),
        notunder(box2, sw1),
        diff(room1, room2),
        diff(room2, room3),
        diff(room3, room4),
        diff(room2, room1),
        diff(room3, room2),
        diff(room4, room3),
        diff(room1, korr),
        diff(room2, korr),
        diff(room3, korr),
        diff(room4, korr), 
        diff(korr, room1),
        diff(korr, room2),
        diff(korr, room3),
        diff(korr, room4),
        lighton(sw1),
        lightoff(sw2),
        lighton(sw3),
        lightoff(sw4)
    ]). 
