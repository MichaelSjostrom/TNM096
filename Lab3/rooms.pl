% Shakeys rooms

%Shakeys actions
act( go(X, Y),
     [sAt(X)],               % preconditions
     [sAt(X)],                % delete
     [sAt(Y)]                % add
     ).

act( push(b, X, Y),
     [lightsOn(room), ])


goal_state( [on(c,b),on(a,c) ]).

initial_state(
     [      clear(b),
            clear(c),
            on(c,a),
            on(a,table),
            on(b,table),
            handempty,
            block(a),
            block(b),
            block(c),
            diff(a,b),
            diff(a,c),
            diff(b,a),
            diff(b,c),
            diff(c,a),
            diff(c,b),
            diff(a,table),
            diff(b,table),
            diff(c,table)
     ]).