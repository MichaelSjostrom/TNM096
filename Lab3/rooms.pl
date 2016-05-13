% Shakey World

%Shakeys actions
act( go(X, Y),
     [sAt(X)],               % preconditions
     [sAt(X)],                % delete
     [sAt(Y)]                % add
     ).

act( push(b, X, Y),
     [lighton(room),]).


act( turnon(sw),
    [on(s, box), lightoff(room)],    %preconditions
    [lightoff(room)],                %delete
    [lighton(room)]
).

act( turnoff(sw),
    [on(s, box), lighton(room)],    %preconditions
    [lighton(room)],                %delete
    [lightoff(room)]
).

% States
% Shakey should be in room1
% Switch of light in room1
% Box2 should be in room2

goal_state( [in(s, room1),  in(box2, room2), lightoff(room2)] ).

initial_state( [
        in(s, room3),
        in(box1, room1),
        in(box2, room1),
        in(box3, room1),
        in(box4, room1),
        room(room1),
        room(room2),
        room(room3),
        room(room4),
        box(box1),
        box(box2),
        box(box3),
        box(box4),
        lightoff(room3),
        lightoff(room2),
        lighton(room1),
        lighton(room4),
        diff(box1, box2),
        diff(box2, box3),
        diff(box3, box4),
        diff(box2, box1),
        diff(box3, box2),
        diff(box4, box3),
        diff(room1, room2),
        diff(room2, room3),
        diff(room3, room4),
        diff(room2, room1),
        diff(room3, room2),
        diff(room4, room3),
    ] ). 

