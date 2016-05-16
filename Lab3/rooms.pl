% Shakey World

%Shakeys actions
act( goBetweenRooms(Room, Room2),

    [in(s, Room), connected(Room, Room2)],
    [in(s, Room)],
    [in(s, Room2)]

).

%act( push(b, X, Y),

act( climbUp(Box),
     [on(s, floor)],
     [on(s, floor)],
     [on(s, Box)]
).

act( climbDown(Box),
     [on(s, Box)],
     [on(s, Box)],
     [on(s, floor)]
).

%act( turnon(sw),
%    [on(s, box), lightoff(room)],    %preconditions
%    [lightoff(room)],                %delete
%    [lighton(room)]
%).

act( turnoff(Room),
    [lighton(Room)],    %preconditions
    [lighton(Room)],                %delete
    [lightoff(Room)]
).

% States
% Shakey should be in room1
% Switch of light in room1
% Box2 should be in room2

%goal_state( [in(s, room1),  in(box2, room2), lightoff(room2)] ).

goal_state( [on(s, Box2)] ).

%goal_state( [sAt(X)] ).
    
initial_state( [
        in(s, room3),
        on(s, floor),
        room(room1),
        room(room2),
        room(room3),
        room(room4),
        room(korr),
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
        in(box1, room1),
        in(box2, room1),
        lightoff(room3),
        lightoff(room2),
        lighton(room1),
        lighton(room4),
        lighton(korr),
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
        diff(korr, room4) 
    ]). 

        %box(box1),
        %box(box2),
        %box(box3),
        %box(box4),
        %lightoff(room3),
        %lightoff(room2),
        %lighton(room1),
        %lighton(room4),
        %lighton(korr),
        %diff(box1, box2),
        %diff(box2, box3),
        %diff(box3, box4),
        %diff(box2, box1),
        %diff(box3, box2),
        %diff(box4, box3),

