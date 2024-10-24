<h2>World Border</h2>
<p><a href="https://github.com/Serilum/World-Border"><img src="https://serilum.com/assets/data/logo/world-border.png"></a></p><h2>Download</h2>
<p>You can download World Border on CurseForge and Modrinth:</p><p>&nbsp;&nbsp;CurseForge: &nbsp;&nbsp;<a href="https://curseforge.com/minecraft/mc-mods/world-border">https://curseforge.com/minecraft/mc-mods/world-border</a><br>&nbsp;&nbsp;Modrinth: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="https://modrinth.com/mod/world-border">https://modrinth.com/mod/world-border</a></p>
<h2>Issue Tracker</h2>
<p>To keep a better overview of all mods, the issue tracker is located in a separate repository.<br>&nbsp;&nbsp;For issues, ideas, suggestions or anything else, please follow this link:</p>
<p>&nbsp;&nbsp;&nbsp;&nbsp;-> <a href="https://serilum.com/url/issue-tracker">Issue Tracker</a></p>
<h2>Pull Requests</h2>
<p>Because of the way mod loader files are bundled into one jar, some extra information is needed to do a PR.<br>&nbsp;&nbsp;A wiki page entry about it is available here:</p>
<p>&nbsp;&nbsp;&nbsp;&nbsp;-> <a href="https://serilum.com/url/pull-requests">Pull Request Information</a></p>
<h2>Mod Description</h2>
<p style="text-align:center"><a href="https://serilum.com/" target="_blank" rel="nofollow"><img src="https://github.com/Serilum/.cdn/raw/main/description/header/header.png" alt="" width="838" height="400"></a></p>
<p style="text-align:center"><a href="https://curseforge.com/members/serilum/projects" target="_blank" rel="nofollow"><img src="https://raw.githubusercontent.com/Serilum/.data-workflow/main/badges/svg/curseforge.svg" width="200"></a> <a href="https://modrinth.com/user/Serilum" target="_blank" rel="nofollow"><img src="https://raw.githubusercontent.com/Serilum/.data-workflow/main/badges/svg/modrinth.svg" width="200"></a> <a href="https://patreon.com/serilum" target="_blank" rel="nofollow"><img src="https://raw.githubusercontent.com/Serilum/.data-workflow/main/badges/svg/patreon.svg" width="200"></a> <a href="https://youtube.com/@serilum" target="_blank" rel="nofollow"><img src="https://raw.githubusercontent.com/Serilum/.data-workflow/main/badges/svg/youtube.svg" width="200"></a></p>
<p><strong><span style="font-size:24px">Requires the library mod <a style="font-size:24px" href="https://curseforge.com/minecraft/mc-mods/collective" target="_blank" rel="nofollow">Collective</a>.</span></strong><br><br><span style="font-size:18px">World Border is a minimalistic configurable mod which allows the creation of a configurable world border, limiting the world size. This can prevent infinitely large file sizes or keep a community of players closer together. You can also loop around the world when hitting a world border, configurable in the config. This will teleport you to the negative coordinate if you hit the positive border and vice versa. Makes for infinitely looping worlds while still limiting the size.</span><br><br><br><span style="font-size:18px"><strong><span style="font-size:20px">Configurable:</span> <span style="color:#008000;font-size:14px"><a style="color:#008000" href="https://github.com/Serilum/.information/wiki/how-to-configure-mods" rel="nofollow">(&nbsp;how do I configure?&nbsp;)</a></span></strong></span><strong><br>enableCustomOverworldBorder</strong>&nbsp;(default = true): When enabled, uses the overworldBorderCoords to set the border.<br><strong>enableCustomNetherBorder</strong>&nbsp;(default = false): When enabled, uses the netherBorderCoords to set the border.<br><strong>enableCustomEndBorder</strong>&nbsp;(default = true): When enabled, uses the endBorderCoords to set the border.<br><br><strong>shouldLoopToOppositeBorder</strong>&nbsp;(default = true): When enabled, instead of teleporting the player inside near where they were, teleports them from the positive to the negative x/z coord and vice versa.<br><strong>distanceTeleportedBack</strong>&nbsp;(default = 10, min 0, max 1000): The amount of blocks the player is teleported inside after hitting the border.<br><br><strong>nearBorderMessage</strong>&nbsp;(default = "You're getting close to the world border!"): The message which will be sent to the player when they are within 'distanceTeleportedBack' to the world border.<br><strong>hitBorderMessage</strong>&nbsp;(default = "You've hit the world border, and were teleported inside!"): The message which will be sent to the player when they hit the world border.<br><strong>loopBorderMessage</strong>&nbsp;(default = "You've hit the world border, and have looped around the world!"): The message sent to the player when they hit the border and 'shouldLoopToOppositeBorder' is enabled.<br><br><strong>overworldBorderPositiveX</strong>&nbsp;(default = 5000, min 0, max 100000): The overworld border located at the positive x coordinate.<br><strong>overworldBorderNegativeX</strong>&nbsp;(default = -5000, min -100000, max 0): The overworld border located at the negative x coordinate.<br><strong>overworldBorderPositiveZ</strong>&nbsp;(default = 5000, min 0, max 100000): The overworld border located at the positive z coordinate.<br><strong>overworldBorderNegativeZ</strong>&nbsp;(default = -5000, min -100000, max 0): The overworld border located at the negative z coordinate.<br><br><strong>netherBorderPositiveX</strong>&nbsp;(default = 625, min 0, max 100000): The nether border located at the positive x coordinate.<br><strong>netherBorderNegativeX</strong>&nbsp;(default = -625, min -100000, max 0): The nether border located at the negative x coordinate.<br><strong>netherBorderPositiveZ</strong>&nbsp;(default = 625, min 0, max 100000): The nether border located at the positive z coordinate.<br><strong>netherBorderNegativeZ</strong>&nbsp;(default = -625, min -100000, max 0): The nether border located at the negative z coordinate.<br><br><strong>endBorderPositiveX</strong>&nbsp;(default = 5000, min 0, max 100000): The end border located at the positive x coordinate.<br><strong>endBorderNegativeX</strong>&nbsp;(default = -5000, min -100000, max 0): The end nether border located at the negative x coordinate.<br><strong>endBorderPositiveZ</strong>&nbsp;(default = 5000, min 0, max 100000): The end nether border located at the positive z coordinate.<br><strong>endBorderNegativeZ</strong>&nbsp;(default = -5000, min -100000, max 0): The end nether border located at the negative z coordinate.<br><br><br><br><strong>When getting close to the border, players will receive the following message:</strong><br><picture><img src="https://github.com/Serilum/.cdn/raw/main/projects/world-border/a.jpg" width="653" height="44"></picture></p>
<p><strong><strong>The message when hitting the world border and enableLoop enabled.</strong></strong><br><picture><img src="https://github.com/Serilum/.cdn/raw/main/projects/world-border/b.jpg" width="892" height="69"></picture><br><strong><br>On hitting the border with enableLoop disabled, players will receive a message and be teleported 10 blocks inside the border.<br><picture><img src="https://github.com/Serilum/.cdn/raw/main/projects/world-border/c.jpg" width="871" height="39"></picture><br><br></strong><strong>Looping works like this:<br><picture><img src="https://github.com/Serilum/.cdn/raw/main/projects/world-border/d.jpg" width="395" height="248"></picture><em><br><span style="font-size:14px">Looping in the nether uses clever code to not end up in lava or on the nether roof.</span></em><br></strong></p>
<p><br>------------------<br><br><span style="font-size:24px"><strong>You may freely use this mod in any modpack, as long as the download remains hosted within the CurseForge or Modrinth ecosystem.</strong></span><br><br><span style="font-size:18px"><a style="font-size:18px;color:#008000" href="https://serilum.com/" rel="nofollow">Serilum.com</a> contains an overview and more information on all mods available.</span><br><br><span style="font-size:14px">Comments are disabled as I'm unable to keep track of all the separate pages on each mod.</span><span style="font-size:14px"><br>For issues, ideas, suggestions or anything else there is the&nbsp;<a style="font-size:14px;color:#008000" href="https://github.com/Serilum/.issue-tracker" rel="nofollow">Github repo</a>. Thanks!</span><span style="font-size:6px"><br><br></span></p>
<p style="text-align:center"><a href="https://serilum.com/donate" rel="nofollow"><img src="https://github.com/Serilum/.cdn/raw/main/description/projects/support.svg" alt="" width="306" height="50"></a></p>