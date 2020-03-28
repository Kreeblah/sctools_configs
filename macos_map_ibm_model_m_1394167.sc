macroblock
    macro F24
        PUSH_META CLEAR_META all
        SET_META MACOS_LCOMMAND
        PRESS SPACE
        POP_ALL_META
    endmacro
endblock

remapblock
# Top row of function keys, left-to-right
    F13 ESC
    F14 MACOS_POWER
    F15 MACOS_VIEW_DESKTOP
    F16 MACOS_BRIGHTNESS_DOWN

    F17 MACOS_BRIGHTNESS_UP
    F18 MACOS_PREV_TRACK
    F19 MACOS_PLAY_PAUSE
    F20 MACOS_NEXT_TRACK

    F21 MACOS_VOLUME_MUTE
    F22 MACOS_VOLUME_DOWN
    F23 MACOS_VOLUME_UP
#    F24 

# Bottom row of function keys, left-to-right
#    F1 
#    F2 
#    F3 
#    F4 

#    F5 
#    F6 
#    F7 
#    F8 

#    F9 
#    F10 
#    F11 
#    F12 

# Left 10-key block, left-to-right, top-to-bottom
    EXTRA_F1 MACOS_BRIGHTNESS_DOWN
    EXTRA_F2 MACOS_BRIGHTNESS_UP
    EXTRA_F3 MACOS_VOLUME_DOWN
    EXTRA_F4 MACOS_VOLUME_UP
    EXTRA_F5 MACOS_LCONTROL
    EXTRA_F6 MACOS_LOPTION
    EXTRA_F7 MACOS_LCOMMAND
    EXTRA_F8 MACOS_RCONTROL
    EXTRA_F9 MACOS_ROPTION
    EXTRA_F10 MACOS_RCOMMAND

# Top row of QWERTY section, left-to-right, beginning with Backtick
#    BACK_QUOTE 
#    1 
#    2 
#    3 
#    4 
#    5 
#    6 
#    7 
#    8 
#    9 
#    0 
#    MINUS 
#    EQUAL 
#    BACKSPACE 

# Second row of QWERTY section, left-to-right, beginning with Tab, without the Field Exit key
#    TAB 
#    Q 
#    W 
#    E 
#    R 
#    T 
#    Y 
#    U 
#    I 
#    O 
#    P 
#    LEFT_BRACE 
#    RIGHT_BRACE 

# Third row of QWERTY section, left-to-right, beginnging with Caps Lock, with the Field Exit key
#    CAPS_LOCK 
#    A 
#    S 
#    D 
#    F 
#    G 
#    H 
#    J 
#    K 
#    L 
#    SEMICOLON 
#    QUOTE 
    EUROPE_1 BACKSLASH
#    ENTER 

# Fourth row of QWERTY section, left-to-right, beginning with Left Shift
#    LSHIFT 
    EUROPE_2 LSHIFT
#    Z 
#    X 
#    C 
#    V 
#    B 
#    N 
#    M 
#    COMMA 
#    PERIOD 
#    SLASH 
#    RSHIFT 

# Bottom row of QUWERTY section (with the Space Bar), left-to-right, beginning with Reset/Quit
#    LCTRL 
    LALT MACOS_LCOMMAND
#    SPACE 
    RALT MACOS_RCOMMAND
    RCTRL MACOS_ROPTION

# Top row of six-key block above arrow keys, left-to-right
#    INSERT 
#    HOME 
#    PAGE_UP

# Bottom row of six-key block above arrow keys, left-to-right
#    DELETE
#    END
#    PAGE_DOWN

# Arrow keys, in the order of: up, right, down, left, center key
#    UP 
#    RIGHT 
    DOWN ENTER
#    LEFT 
    LANG_4 DOWN

# Top row of numeric keypad block, left-to-right
    ESC NUM_LOCK
    NUM_LOCK PAD_EQUALS
    SCROLL_LOCK PAD_SLASH
    EXTRA_SYSRQ PAD_ASTERIX

# Second row of numeric keypad block, left-to-right
#    PAD_7 
#    PAD_8 
#    PAD_9 
    PAD_ASTERIX PAD_MINUS

# Third row of numeric keypad block, left-to-right
#    PAD_4 
#    PAD_5 
#    PAD_6 
    PAD_MINUS PAD_PLUS

# Fourth row of numeric keypad block, left-to-right, without Field + key
#    PAD_1 
#    PAD_2 
#    PAD_3 

# Fifth row of numeric keypad block, left-to-right, including Field + key
#    PAD_0 
#    PAD_PERIOD 
    PAD_PLUS PAD_ENTER

endblock